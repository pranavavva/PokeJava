[![Build Status](https://travis-ci.org/20avva/PokeJava.svg?branch=master)](https://travis-ci.org/20avva/PokeJava)
[![CircleCI](https://circleci.com/gh/20avva/PokeJava.svg?style=svg)](https://circleci.com/gh/20avva/PokeJava)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Coverage Status](https://coveralls.io/repos/github/20avva/PokeJava/badge.svg)](https://coveralls.io/github/20avva/PokeJava)
[![Snap Status](https://build.snapcraft.io/badge/20avva/PokeJava.svg)](https://build.snapcraft.io/user/20avva/PokeJava)

# PokeJava

A Pokemon Battle Simulator written in Java. Uses the Maven build system.

# Instructions

## Jarfile

Please go [here](https://20avva.github.io/PokeJava) to download the jar. When you have downloaded the jar, open a terminal
or Command Prompt and type `java -jar PokeJavaApp-4.1.jar`. You need to be in the same directory as the jar file for this to work.

## Snap
```bash
sudo apt install snapd # Install snap support
snap find pokejava # Make sure pokejava is in the stable channel
snap install pokejava # install the app
pokejava # Run it! You may need to use `sudo`
```

# Licensing

This project is licensed under the MIT License. It is free to use by anyone.

# A Note To Contributors

Please run `mvn clean` before pushing to git to prevent any unneeded file clashes.

Put the resulting `.jar` file in the project root, otherwise, snapcraft won't be able to snap the project together.
