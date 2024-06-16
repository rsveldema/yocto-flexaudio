
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += " file://certs/development-1.key.pem"
SRC_URI += " file://certs/development-1.cert.pem"

do_install:append() {
    bbplain "appending!!!!!!!!!!!!!!!!!!"
}