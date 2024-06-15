LICENSE="CLOSED"


SRC_URI = "git://github.com/rsveldema/flex-audio;branch=main;protocol=ssh"

SRCREV= "main"

RDEPENDS:${PN} += "liburing"


inherit cmake
