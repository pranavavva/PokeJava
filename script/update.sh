#!/bin/sh

echo "==> Bootstrapping"
sh ./boostrap.sh

echo "==> Cleaning working directory"
mvn clean
