SUMMARY = "Add rove user"
DESCRIPTION = "Add rove user"
SECTION = "flexaudio user"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

S = "${WORKDIR}"

inherit useradd

# You must set USERADD_PACKAGES when you inherit useradd. This
# lists which output packages will include the user/group
# creation code.
USERADD_PACKAGES = "${PN}"

# USERADD_PARAM specifies command line options to pass to the
# useradd command. Multiple users can be created by separating
# the commands with a semicolon. Here we'll create two users,
# user1 and user2:

# AKA: 'rove'
PASS="\$6\$BRFiyi.Gl1bMHPwD\$6RyvrpgWktcTcq1wE5SUmhcl4mfIa.xQCiWCPWJeJD9P.KQqOWG6fpiZsrfwHKkQB/U6AFfVyj.qvE7vmaD3N0"
USERADD_PARAM:${PN} = "-u 1200 -d /home/rove -p ${PASS} -r -s /bin/bash rove"

# GROUPADD_PARAM works the same way, which you set to the options
# you'd normally pass to the groupadd command. This will create
# groups group1 and group2:
GROUPADD_PARAM:${PN} = "-g 880 group1"


do_install () {
	install -d -m 755 ${D}/data
}

FILES:${PN} += "/data"

# Prevents do_package failures with:
# debugsources.list: No such file or directory:
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"