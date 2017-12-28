#!/usr/bin/python3

import os
from os import system
import sys

want = str(input("This script requires sudo. Do you have superuser perms? YES or NO")

if want.lower() == "yes":
	print("==> Updating")
	system("script/update")

	print("==> Snapcrafting")
	system("snapcraft")
	system("snap install PokeJavaApp-4.1.1.snap")
	system("sudo pokejava")
else:
	sys.exit(0)
