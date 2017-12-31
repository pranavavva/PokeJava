#!/bin/bash

set -e

snapcraft clean pokejava
snapcraft
sudo snap install pokejava_*_amd64.snap --devmode --dangerous

echo '==> pokejava is ready to run. Use `sudo pokejava` to run'
