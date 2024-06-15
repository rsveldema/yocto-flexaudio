#!/bin/sh


DIR=build/tmp/deploy/images/raspberrypi4-64/
BMAP=$DIR/flex-audio-image-rpi-raspberrypi4-64.rootfs.wic.bmap
WIC=$DIR/flex-audio-image-rpi-raspberrypi4-64.rootfs.wic.bz2

sudo bmaptool copy --bmap $BMAP $WIC /dev/sdb

