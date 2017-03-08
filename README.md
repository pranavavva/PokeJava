# PokeJava

A Pokemon Battle Simulator built in Java. Uses the Gradle build automation system.

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