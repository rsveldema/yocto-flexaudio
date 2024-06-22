Yocto image scripts for flexaudio
----------------------------------


Usage:

```bash
. ./init.sh
bitbake flex-audio-image-rpi
bitbake update-bundle-flex-audio-rpi
```

To update a running system:
```bash

export IP=192.168.1.123

scp build/tmp/deploy/images/raspberrypi4-64/update-bundle-flex-audio-rpi-raspberrypi4-64.raucb  root@$IP:

sshpass -p root ssh root@$IP
```bash

To create an SDK:

```bash
. ./init.sh
bitbake flex-audio-image-rpi -c populate_sdk
```

