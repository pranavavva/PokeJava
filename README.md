[![Build Status](https://travis-ci.org/20avva/PokeJava.svg?branch=master)](https://travis-ci.org/20avva/PokeJava)
[![CircleCI](https://circleci.com/gh/20avva/PokeJava.svg?style=svg)](https://circleci.com/gh/20avva/PokeJava)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Coverage Status](https://coveralls.io/repos/github/20avva/PokeJava/badge.svg)](https://coveralls.io/github/20avva/PokeJava)

<p style="font-size: 50px;">BelowNot Applicable for current version will update soon</p>

# PokeJava

A Pokemon Battle Simulator written in Java. Uses the Maven build system. Once upon a time used Gradle.

# Instructions

The `.jar` file is located in `target/`. `.class` files are located in `target/classes/me/pavva/PokeJava`. To run
 `.class` files, run `cd target/classes && java me.pavva.PokeJava.App`.
 
Source Files (`.java`) are located in `src/main/java/me/pavva/PokeJava`
 
See the project tree below.

# Licensing

This project is licensed under the MIT License. It is free to use by anyone.

# A Note To Contributors

Please run `mvn clean` before pushing to git to prevent any uneeded file clashes.

# Project Tree
```
.
├── _config.yml
├── docs
│   ├── _config.yml
│   ├── index.md
│   └── styles.css
├── LICENSE
├── pom.xml
├── README.md
└── src
    ├── main
    │   └── java
    │       └── me
    │           └── pavva
    │               └── PokeJava
    │                   ├── App.java
    │                   └── Pokemon.java
    └── test
        └── java
            └── me
                └── pavva
                    └── PokeJava
                        └── PokemonTest.java

12 directories, 10 files
```