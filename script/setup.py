#!/usr/bin/python3

import os
from os import system
import sys

while True:
	print("This script is to be used only to return the working directory to an initial clone state. Is this what you want? YOUR CHANGES WILL BE STASHED AND BRANCH MASTER WILl BE CHECKED OUT")

	want_str = str(input("Yes or No?"))
	if want_str.lower() == "yes":
		want = True
		break
	elif want_str.lower() == "no":
		want = False
		sys.exit(0)
	else:
		print("That's not an answer. Enter YES or NO")

print("==> cleaning working directory")
system("mvn clean")

print("==> stashing changes")
system("git stash")

print("==> checking out to master")
system("git checkout master")

print("==> Bootstrapping")
system("bootstrap.py")

print("==> Working directory cleaned, branch master checked out, dependencies installed.")
