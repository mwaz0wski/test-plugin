package com.miguel;

import org.apache.maven.model.Dependency;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

import java.util.List;

/**
 * Implementation of the dependency counter Mojo described
 * in the baeldung article <a href="https://www.baeldung.com/maven-plugin">...</a>
 */
@Mojo(name = "dependency-counter", defaultPhase = LifecyclePhase.COMPILE)
public class DependencyCounterMojo extends AbstractMojo {
    @Parameter(defaultValue = "${project}", required = true, readonly = true)
    private MavenProject project;

    @Parameter(property = "scope")
    private String scope;

    @Override
    public void execute() {
        List<Dependency> dependencies = project.getDependencies();
        long numDependencies = dependencies.stream().filter(d -> (scope == null || scope.isEmpty()) || scope.equals(d.getScope())).count();
        getLog().info("Number of dependencies: " + numDependencies);
    }
}
