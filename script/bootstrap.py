#!/usr/bin/python3

from os import system as sys
import os

if (os.path.isfile('./pom.xml')):
	sys("mvn dependency:resolve")

print()
print("==> Dependencies Installed")
