package com.miguel;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "hello-world", defaultPhase = LifecyclePhase.COMPILE)
public class HelloWorldMojo extends AbstractMojo {

    @Override
    public void execute() {
        getLog().info("Hello World!");
    }
}
