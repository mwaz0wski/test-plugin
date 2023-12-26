package com.miguel;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.commons.lang3.StringUtils;

@Mojo(name = "hello-world", defaultPhase = LifecyclePhase.COMPILE)
public class HelloWorldMojo extends AbstractMojo {

    @Parameter(property = "name")
    private String name;

    @Override
    public void execute() {
        var message = StringUtils.isBlank(name) ? "World" : name;
        getLog().info("Hello, " + message + "!");
    }
}
