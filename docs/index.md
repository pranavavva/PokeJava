<head>
    <link rel="stylesheet" href="styles.css" />
</head>

<a href="https://github.com/20avva/pavva.me">
    <img style="position: absolute; top: 0; right: 0; border: 0;" src="https://camo.githubusercontent.com/365986a132ccd6a44c23a9169022c0b5c890c387/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f6769746875622f726962626f6e732f666f726b6d655f72696768745f7265645f6161303030302e706e67" alt="Fork me on GitHub" data-canonical-src="https://s3.amazonaws.com/github/ribbons/forkme_right_red_aa0000.png">
</a>

[![Build Status](https://travis-ci.org/20avva/PokeJava.svg?branch=master)](https://travis-ci.org/20avva/PokeJava)
[![CircleCI](https://circleci.com/gh/20avva/PokeJava.svg?style=svg)](https://circleci.com/gh/20avva/PokeJava)
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

<div class="footer">
    <a href="/humans.txt">
        <img src="http://humanstxt.org/img/oficial-logos/humanstxt-transparent-color.png" alt="humansTXT" style="width:88px;height:31px;">
    </a>
    
    <a href="http://pavva.me">
        <button type="button" class="HomeButton">
            Back To Home
        </button>
    </a>
</div>