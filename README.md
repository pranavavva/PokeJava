[![Build Status](https://travis-ci.org/20avva/PokeJava.svg?branch=master)](https://travis-ci.org/20avva/PokeJava)
[![CircleCI](https://circleci.com/gh/20avva/PokeJava.svg?style=svg)](https://circleci.com/gh/20avva/PokeJava)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Coverage Status](https://coveralls.io/repos/github/20avva/PokeJava/badge.svg)](https://coveralls.io/github/20avva/PokeJava)

# PokeJava

A Pokemon Battle Simulator written in Java. Uses the Maven build system.

# Instructions

Please go [here](https://20avva.github.io/PokeJava) to download the jar. When you have downloaded the jar, open a terminal
or Command Prompt and type `java -jar PokeJavaApp-4.1.jar`. You need to be in the same directory as the jar file for this to work.

Source Files (`.java`) are located in `src/main/java/me/pavva/pokejava`
 
See the project tree below.

# Licensing

This project is licensed under the MIT License. It is free to use by anyone.

# A Note To Contributors

Please run `mvn clean` before pushing to git to prevent any unneeded file clashes.

# Project Tree
```
.
├── _config.yml
├── docs
│   ├── Classes.tar.gz
│   ├── Classes.zip
│   ├── index.html
│   ├── JavaDoc
│   │   ├── allclasses-frame.html
│   │   ├── allclasses-noframe.html
│   │   ├── constant-values.html
│   │   ├── deprecated-list.html
│   │   ├── help-doc.html
│   │   ├── index-all.html
│   │   ├── index.html
│   │   ├── me
│   │   │   └── pavva
│   │   │       └── pokejava
│   │   │           ├── App.html
│   │   │           ├── class-use
│   │   │           │   ├── App.html
│   │   │           │   ├── Helper.html
│   │   │           │   ├── Move.html
│   │   │           │   ├── Pokemon.html
│   │   │           │   └── Type.html
│   │   │           ├── Helper.html
│   │   │           ├── Move.html
│   │   │           ├── moves
│   │   │           │   ├── BugMoves.html
│   │   │           │   ├── class-use
│   │   │           │   │   ├── BugMoves.html
│   │   │           │   │   ├── DarkMoves.html
│   │   │           │   │   ├── DragonMoves.html
│   │   │           │   │   ├── ElectricMoves.html
│   │   │           │   │   ├── FairyMoves.html
│   │   │           │   │   ├── FightMoves.html
│   │   │           │   │   ├── FireMoves.html
│   │   │           │   │   ├── FlyingMoves.html
│   │   │           │   │   ├── GhostMoves.html
│   │   │           │   │   ├── GrassMoves.html
│   │   │           │   │   ├── GroundMoves.html
│   │   │           │   │   ├── IceMoves.html
│   │   │           │   │   ├── NormalMoves.html
│   │   │           │   │   ├── PoisonMoves.html
│   │   │           │   │   ├── PsychicMoves.html
│   │   │           │   │   ├── RockMoves.html
│   │   │           │   │   ├── SteelMoves.html
│   │   │           │   │   └── WaterMoves.html
│   │   │           │   ├── DarkMoves.html
│   │   │           │   ├── DragonMoves.html
│   │   │           │   ├── ElectricMoves.html
│   │   │           │   ├── FairyMoves.html
│   │   │           │   ├── FightMoves.html
│   │   │           │   ├── FireMoves.html
│   │   │           │   ├── FlyingMoves.html
│   │   │           │   ├── GhostMoves.html
│   │   │           │   ├── GrassMoves.html
│   │   │           │   ├── GroundMoves.html
│   │   │           │   ├── IceMoves.html
│   │   │           │   ├── NormalMoves.html
│   │   │           │   ├── package-frame.html
│   │   │           │   ├── package-summary.html
│   │   │           │   ├── package-tree.html
│   │   │           │   ├── package-use.html
│   │   │           │   ├── PoisonMoves.html
│   │   │           │   ├── PsychicMoves.html
│   │   │           │   ├── RockMoves.html
│   │   │           │   ├── SteelMoves.html
│   │   │           │   └── WaterMoves.html
│   │   │           ├── package-frame.html
│   │   │           ├── package-summary.html
│   │   │           ├── package-tree.html
│   │   │           ├── package-use.html
│   │   │           ├── pokemon
│   │   │           │   ├── BugPokemon.html
│   │   │           │   ├── class-use
│   │   │           │   │   ├── BugPokemon.html
│   │   │           │   │   ├── DarkPokemon.html
│   │   │           │   │   ├── DragonPokemon.html
│   │   │           │   │   ├── ElectricPokemon.html
│   │   │           │   │   ├── FairyPokemon.html
│   │   │           │   │   ├── FightPokemon.html
│   │   │           │   │   ├── FirePokemon.html
│   │   │           │   │   ├── FlyingPokemon.html
│   │   │           │   │   ├── GhostPokemon.html
│   │   │           │   │   ├── GrassPokemon.html
│   │   │           │   │   ├── GroundPokemon.html
│   │   │           │   │   ├── IcePokemon.html
│   │   │           │   │   ├── NormalPokemon.html
│   │   │           │   │   ├── PoisonPokemon.html
│   │   │           │   │   ├── PsychicPokemon.html
│   │   │           │   │   ├── RockPokemon.html
│   │   │           │   │   ├── SteelPokemon.html
│   │   │           │   │   └── WaterPokemon.html
│   │   │           │   ├── DarkPokemon.html
│   │   │           │   ├── DragonPokemon.html
│   │   │           │   ├── ElectricPokemon.html
│   │   │           │   ├── FairyPokemon.html
│   │   │           │   ├── FightPokemon.html
│   │   │           │   ├── FirePokemon.html
│   │   │           │   ├── FlyingPokemon.html
│   │   │           │   ├── GhostPokemon.html
│   │   │           │   ├── GrassPokemon.html
│   │   │           │   ├── GroundPokemon.html
│   │   │           │   ├── IcePokemon.html
│   │   │           │   ├── NormalPokemon.html
│   │   │           │   ├── package-frame.html
│   │   │           │   ├── package-summary.html
│   │   │           │   ├── package-tree.html
│   │   │           │   ├── package-use.html
│   │   │           │   ├── PoisonPokemon.html
│   │   │           │   ├── PsychicPokemon.html
│   │   │           │   ├── RockPokemon.html
│   │   │           │   ├── SteelPokemon.html
│   │   │           │   └── WaterPokemon.html
│   │   │           ├── Pokemon.html
│   │   │           └── Type.html
│   │   ├── overview-frame.html
│   │   ├── overview-summary.html
│   │   ├── overview-tree.html
│   │   ├── package-list
│   │   ├── script.js
│   │   └── stylesheet.css
│   ├── jumbotron.css
│   ├── MavenSite
│   │   ├── css
│   │   │   ├── maven-base.css
│   │   │   ├── maven-theme.css
│   │   │   ├── print.css
│   │   │   └── site.css
│   │   ├── dependencies.html
│   │   ├── dependency-convergence.html
│   │   ├── dependency-info.html
│   │   ├── distribution-management.html
│   │   ├── images
│   │   │   ├── close.gif
│   │   │   ├── collapsed.gif
│   │   │   ├── expanded.gif
│   │   │   ├── external.png
│   │   │   ├── icon_error_sml.gif
│   │   │   ├── icon_info_sml.gif
│   │   │   ├── icon_success_sml.gif
│   │   │   ├── icon_warning_sml.gif
│   │   │   ├── logos
│   │   │   │   ├── build-by-maven-black.png
│   │   │   │   ├── build-by-maven-white.png
│   │   │   │   └── maven-feather.png
│   │   │   └── newwindow.png
│   │   ├── index.html
│   │   ├── plugin-management.html
│   │   ├── plugins.html
│   │   ├── project-info.html
│   │   └── project-summary.html
│   └── PokeJavaApp-4.1.jar
├── LICENSE
├── pom.xml
├── README.md
└── src
    ├── main
    │   └── java
    │       └── me
    │           └── pavva
    │               └── pokejava
    │                   ├── App.java
    │                   ├── Helper.java
    │                   ├── Move.java
    │                   ├── moves
    │                   │   ├── BugMoves.java
    │                   │   ├── DarkMoves.java
    │                   │   ├── DragonMoves.java
    │                   │   ├── ElectricMoves.java
    │                   │   ├── FairyMoves.java
    │                   │   ├── FightMoves.java
    │                   │   ├── FireMoves.java
    │                   │   ├── FlyingMoves.java
    │                   │   ├── GhostMoves.java
    │                   │   ├── GrassMoves.java
    │                   │   ├── GroundMoves.java
    │                   │   ├── IceMoves.java
    │                   │   ├── NormalMoves.java
    │                   │   ├── package-info.java
    │                   │   ├── PoisonMoves.java
    │                   │   ├── PsychicMoves.java
    │                   │   ├── RockMoves.java
    │                   │   ├── SteelMoves.java
    │                   │   └── WaterMoves.java
    │                   ├── package-info.java
    │                   ├── pokemon
    │                   │   ├── BugPokemon.java
    │                   │   ├── DarkPokemon.java
    │                   │   ├── DragonPokemon.java
    │                   │   ├── ElectricPokemon.java
    │                   │   ├── FairyPokemon.java
    │                   │   ├── FightPokemon.java
    │                   │   ├── FirePokemon.java
    │                   │   ├── FlyingPokemon.java
    │                   │   ├── GhostPokemon.java
    │                   │   ├── GrassPokemon.java
    │                   │   ├── GroundPokemon.java
    │                   │   ├── IcePokemon.java
    │                   │   ├── NormalPokemon.java
    │                   │   ├── package-info.java
    │                   │   ├── PoisonPokemon.java
    │                   │   ├── PsychicPokemon.java
    │                   │   ├── RockPokemon.java
    │                   │   ├── SteelPokemon.java
    │                   │   └── WaterPokemon.java
    │                   ├── Pokemon.java
    │                   └── Type.java
    └── test
        └── java
            └── me
                └── pavva
                    └── pokejava
                        └── TypeTest.java

27 directories, 186 files
```