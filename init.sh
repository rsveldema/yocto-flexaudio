#!/bin/sh

# OE Build Environment Setup Script
#
# Copyright (C) 2006-2011 Linux Foundation
#
# SPDX-License-Identifier: GPL-2.0-or-later
#

#
# Normally this is called as '. ./oe-init-build-env <builddir>'
#
# This works in most shells (not dash), but not all of them pass the arguments
# when being sourced.  To workaround the shell limitation use "set <builddir>"
# prior to sourcing this script.
#

git submodule update --init --recursive

if [ -n "$BBSERVER" ]; then
    unset BBSERVER
fi

if [ -z "$ZSH_NAME" ] && [ "$0" = "$THIS_SCRIPT" ]; then
    echo "Error: This script needs to be sourced. Please run as '. $THIS_SCRIPT'" >&2
    exit 1
fi


unset THIS_SCRIPT

export SRCDIR=`pwd`
export OEROOT=$SRCDIR/sources/poky
export BITBAKEDIR=$OEROOT/bitbake

. "$OEROOT"/scripts/oe-buildenv-internal &&
    TEMPLATECONF="$TEMPLATECONF" "$OEROOT"/scripts/oe-setup-builddir || {
    unset OEROOT
    return 1
}

# Generate an initial configuration for VSCode and the yocto-bitbake plugin.
if command -v code > /dev/null && [ ! -d "$SRCDIR/.vscode" ]; then
    oe-setup-vscode "$SRCDIR" "$BUILDDIR"
fi

echo $PATH

unset OEROOT

[ -z "$BUILDDIR" ] || cd "$BUILDDIR"

cd $SRCDIR

bitbake-layers add-layer sources/meta-raspberrypi
bitbake-layers add-layer sources/meta-rauc
bitbake-layers add-layer sources/meta-openembedded/meta-oe/
bitbake-layers add-layer sources/meta-openembedded/meta-python/
bitbake-layers add-layer sources/meta-openembedded/meta-networking
bitbake-layers add-layer sources/meta-flexaudio

rm build/conf/local.conf

ln -s $SRCDIR/sources/meta-flexaudio/conf/templates/default/local.conf.sample build/conf/local.conf

DL_DIR=$SRCDIR/downloads
SSTATE_DIR="${HOME}/sstate"


