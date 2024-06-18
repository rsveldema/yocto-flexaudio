
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += " file://certs/development-1.key.pem"
SRC_URI += " file://certs/development-1.cert.pem"
SRC_URI += " file://fw_env.config"
SRC_URI += " file://ca.cert.pem"

do_install:append() {
    install ${WORKDIR}/fw_env.config ${D}/etc
}

FILES:${PN} += "/etc/fw_env.config"
