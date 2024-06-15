DESCRIPTION = "This project contains the flex-audio AES76 server"
LICENSE="CLOSED"


SRC_URI = "git://git@github.com/rsveldema/flex-audio-service;branch=main;protocol=ssh"
SRC_URI += "file://flexaudio.service"

SRCREV= "main"

DEPENDS += "liburing"
DEPENDS += "alsa-lib"

RDEPENDS:${PN} += "liburing"

RDEPENDS:${PN} += "alsa-lib"
RDEPENDS:${PN} += "alsa-tools"
RDEPENDS:${PN} += "alsa-utils"


S = "${WORKDIR}/git"

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE_${PN} = "flexaudio.service"

inherit cmake pkgconfig systemd

