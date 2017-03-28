[![Build Status](https://travis-ci.org/20avva/PokeJava.svg?branch=master)](https://travis-ci.org/20avva/PokeJava)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Coverage Status](https://coveralls.io/repos/github/20avva/PokeJava/badge.svg)](https://coveralls.io/github/20avva/PokeJava)

# PokeJava

A Pokemon Battle Simulator written in Java. Uses the Maven build system. Once upon a time used Gradle.

# Instructions

The `.jar` file is located in `target/`. `.class` files are located in `target/classes/me/pavva/PokeJava`. To run
 `.class` files, run `cd target/classes && java me.pavva.PokeJava.App`.
 
Source Files (`.java`) are located in `src/main/java/me/pavva/PokeJava`
 
See the project tree below.

# Licensing

This project is licensed under the MIT License. It is free to use by anyone.

# Project Tree
```
.
├── LICENSE
├── pom.xml
├── README.md
├── src
│   ├── main
│   │   └── java
│   │       └── me
│   │           └── pavva
│   │               └── PokeJava
│   │                   ├── App.java
│   │                   └── Pokemon.java
│   └── test
│       └── java
│           └── me
│               └── pavva
│                   └── PokeJava
│                       ├── AppTest.java
│                       └── PokemonTest.java
└── target
    ├── classes
    │   └── me
    │       └── pavva
    │           └── PokeJava
    │               ├── App.class
    │               └── Pokemon.class
    ├── coveralls.json
    ├── jacoco.exec
    ├── maven-status
    │   └── maven-compiler-plugin
    │       ├── compile
    │       │   └── default-compile
    │       │       ├── createdFiles.lst
    │       │       └── inputFiles.lst
    │       └── testCompile
    │           └── default-testCompile
    │               ├── createdFiles.lst
    │               └── inputFiles.lst
    ├── site
    │   └── jacoco
    │       ├── index.html
    │       ├── jacoco.csv
    │       ├── jacoco.xml
    │       └── me.pavva.PokeJava
    │           ├── App.html
    │           ├── App.java.html
    │           ├── index.html
    │           ├── index.source.html
    │           ├── Pokemon.html
    │           └── Pokemon.java.html
    ├── surefire-reports
    │   ├── me.pavva.PokeJava.PokemonTest.txt
    │   └── TEST-me.pavva.PokeJava.PokemonTest.xml
    └── test-classes
        └── me
            └── pavva
                └── PokeJava
                    ├── AppTest.class
                    └── PokemonTest.class

30 directories, 28 files
```