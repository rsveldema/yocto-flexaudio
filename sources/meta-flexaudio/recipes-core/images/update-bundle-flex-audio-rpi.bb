inherit bundle

RAUC_BUNDLE_SLOTS = "rootfs"
RAUC_SLOT_rootfs = "flex-audio-image-rpi"

RAUC_KEY_FILE = "${COREBASE}/../meta-flexaudio/recipes-core/rauc/files/certs/development-1.key.pem"
RAUC_CERT_FILE = "${COREBASE}/../meta-flexaudio/recipes-core/rauc/files/certs/development-1.cert.pem"
RAUC_KEYRING_FILE = "${COREBASE}/../meta-flexaudio/recipes-core/rauc/files/ca.cert.pem"