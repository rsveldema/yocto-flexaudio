LICENSE="CLOSED"
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://bcm2711-rpi-4-b.dtb"

do_install:append() {
    bbplain "install xxx ----------------------"

    install -d ${D}/boot
    install ${S}/../bcm2711-rpi-4-b.dtb ${D}/boot
}

FILES:${PN} += "/boot/bcm2711-rpi-4-b.dtb" 
