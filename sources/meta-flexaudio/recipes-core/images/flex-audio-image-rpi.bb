# Base this image on core-image-base
include recipes-core/images/core-image-minimal.bb

COMPATIBLE_MACHINE = "^rpi$"

IMAGE_INSTALL:append = " packagegroup-rpi-test"

IMAGE_INSTALL:append = " bcm2835-tests"
IMAGE_INSTALL:append = " raspi-gpio"
IMAGE_INSTALL:append = " rpio"
IMAGE_INSTALL:append = " rpi-gpio"
IMAGE_INSTALL:append = " pi-blaster"

IMAGE_INSTALL:append = " networkmanager"

