# Base this image on core-image-base
include recipes-core/images/core-image-minimal.bb

COMPATIBLE_MACHINE = "^rpi$"

IMAGE_INSTALL:append = " bcm2835-tests"
IMAGE_INSTALL:append = " raspi-gpio"
IMAGE_INSTALL:append = " rpio"
IMAGE_INSTALL:append = " rpi-gpio"
IMAGE_INSTALL:append = " pi-blaster"

IMAGE_INSTALL:append = " networkmanager"

IMAGE_INSTALL:remove = "cdrtools"
IMAGE_INSTALL:remove = "cdrkit"

inherit extrausers


EXTRA_USERS_PARAMS = " \
    usermod -p '\$1\$SomVbW5V\$qNv7uAZOFr.ivxNehP3DE1' root; \
"
