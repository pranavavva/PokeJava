# PokeJava - v1.0-SNAPSHOT

A Pokemon Battle Simulator built in Java. Uses the Gradle build automation system.

# Instructions

The `.jar` file is already pre-compiled, it should be located in the `build/libs` folder (see the Project Tree below).
From the root of the project, run the `ClickToRun.bat` or `ClickToRun.sh` depending on whether you are running a Windows machine or UNIX-like.
After that, simply follow the in-game instructions! Have fun

# Compilation

+ To obtain `.class` files, run
    
    ```bash
    cd PokeJava
    gradle compile
    cd build/classes/main
    java me.pavva.PokeJava.App
    ```
    
+ To obtain a `.jar`, run
    
    ```bash
    cd PokeJava
    gradle build
    cd build/libs
    java -jar PokeJava.jar
    ```

# License

This project is licensed under the MIT License, 
which declares anyone can fork, adapt, and change the code in any way and use it for private, public, or commercial uses, 
provided you include a copy of the LICENSE in your redistribution.

# Project Tree

```
.
├── ClickToRun.bat
├── ClickToRun.sh
├── LICENSE
├── README.md
├── build
│   ├── classes
│   │   └── main
│   │       └── me
│   │           └── pavva
│   │               └── PokeJava
│   │                   ├── App.class
│   │                   └── Pokemon.class
│   ├── dependency-cache
│   ├── libs
│   │   └── PokeJava.jar
│   └── tmp
│       ├── compileJava
│       │   └── emptySourcePathRef
│       └── jar
│           └── MANIFEST.MF
├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── settings.gradle
└── src
    └── main
        └── java
            └── me
                └── pavva
                    └── PokeJava
                        ├── App.java
                        └── Pokemon.java

```