#!/bin/sh

echo "==> Updating"
sh ./update.sh

echo "==> Snapcrafting"
snapcraft
snap install PokeJavaApp-4.1.1.snap
sudo pokejava
