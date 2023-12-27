<h1 align="center">Maven Test Plugin</h1>

## Overview

This Maven plugin provides two distinct goals:

- **Hello World Goal**: Logs a "Hello World!" message in the Maven output.
- **Dependency Count Goal**: Determines and displays the number of dependencies found in a project's `pom.xml` for a given scope, by default the scope is "compile", but it can be changed with the maven parameter "scope".

## Installation

### Adding the Plugin to Your Project

To include this plugin in your Maven project, modify your `pom.xml` and add the following configurations within the `build` section, depending on the goal you want to use:

```xml
<build>
    <plugins>
        <plugin>
            <groupId>com.miguel</groupId>
            <artifactId>test-maven-plugin</artifactId>
            <version>0.0.1-SNAPSHOT</version>
            <executions>
                <execution>
                    <goals>
                        <goal>hello-world</goal> <!--Includes the goal that logs the "Hello, World!" message-->
                    </goals>
                    <configuration>
                        <name>Mwaz0wski</name> <!--If you set a value in the parameter name, or you set the parameter when running the maven command with -Dname, instead of "Hello, World!", it will be logged "Hello, ${name}!"-->
                    </configuration>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
...
<build>
    <plugins>
        <plugin>
            <groupId>com.miguel</groupId>
            <artifactId>test-maven-plugin</artifactId>
            <version>0.0.1-SNAPSHOT</version>
            <executions>
                <execution>
                    <goals>
                        <goal>count-dependencies</goal>
                    </goals>
                    <configuration>
                        <scope>provided</scope> <!--If you set a scope in the parameter of the same name, the dependencies checked will be the ones
                                                      declared for that scope in the pom.xml. By default the scope checked is compile-->
                    </configuration>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
