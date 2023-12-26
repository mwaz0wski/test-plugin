<h1 align="center">Maven Test Plugin</h1>

## Overview

This Maven plugin provides two distinct goals:

- **Hello World Goal**: Logs a "Hello World!" message in the Maven output.
- **Dependency Count Goal**: Determines and displays the number of dependencies found in a project's `pom.xml` for a given scope, by default the scope is "compile", but it can be changed.

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
                    <id>default-hello-world</id>
                    <goals>
                        <goal>hello-world</goal> <!--Includes the goal that logs the "Hello World!" message-->
                    </goals>
                </execution>
                <configuration>
                    <name>Mwaz0wski</name> <!--If you set a value in the parameter name, instead of "Hello World!", it will be logged "Hello ${name}!"-->
                </configuration>
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
                </execution>
                <configuration>
                    <scope>provided</scope> <!--If you set a scope in the parameter of the same name, the dependencies checked will be the ones
                                                  declared for that scope in the pom.xml. By default the scope checked is compile-->
                </configuration>
            </executions>
        </plugin>
    </plugins>
</build>