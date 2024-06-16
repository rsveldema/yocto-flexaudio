# Base this image on core-image-base
include recipes-core/images/core-image-minimal.bb

COMPATIBLE_MACHINE = "^rpi$"

IMAGE_INSTALL:append = " u-boot-fw-utils"
IMAGE_INSTALL:append = " raspi-dtb"

IMAGE_INSTALL:append = " bcm2835-tests"
IMAGE_INSTALL:append = " raspi-gpio"
IMAGE_INSTALL:append = " rpio"
IMAGE_INSTALL:append = " rpi-gpio"
IMAGE_INSTALL:append = " pi-blaster"
IMAGE_INSTALL:append = " rauc"

IMAGE_INSTALL:append = " flexaudio"

IMAGE_INSTALL:append = " networkmanager"
#IMAGE_INSTALL:append = " set-root-password"
IMAGE_INSTALL:append = " add-users"

IMAGE_INSTALL:remove = "cdrtools"
IMAGE_INSTALL:remove = "cdrkit"
IMAGE_INSTALL:remove = "eudev"
IMAGE_INSTALL:remove = "dnsmasq"

IMAGE_INSTALL:append = " linux-firmware-rpidistro-bcm43455"
IMAGE_INSTALL:append = " packagegroup-core-boot"
IMAGE_INSTALL:append = " packagegroup-core-ssh-openssh"
IMAGE_INSTALL:append = " kernel-modules"
