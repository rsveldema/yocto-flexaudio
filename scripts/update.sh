#!/bin/bash

export IP=192.168.1.123

echo "copying file..."
sshpass -p root scp build/tmp/deploy/images/raspberrypi4-64/update-bundle-flex-audio-rpi-raspberrypi4-64.raucb  root@$IP:

echo "installing update"
sshpass -p root ssh root@$IP 'rauc install update-bundle-flex-audio-rpi-raspberrypi4-64.raucb && reboot'


