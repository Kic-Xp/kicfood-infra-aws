package com.myorg;

import software.amazon.awscdk.App;
import software.amazon.awscdk.Environment;
import software.amazon.awscdk.StackProps;

import java.util.Arrays;

public class KicAwsInfraApp {
    public static void main(final String[] args) {
        App app = new App();

        KicVpcStack vpcStack = new KicVpcStack(app, "Vpc");
        KicClusterStack clusterStack = new KicClusterStack(app, "Cluster", vpcStack.getVpc());
        clusterStack.addDependency(vpcStack);

        KicRdsStack rdsStack = new KicRdsStack(app, "Rds", vpcStack.getVpc());
        rdsStack.addDependency(vpcStack);

        KicServiceStack kicServiceStack = new KicServiceStack(app, "Service", clusterStack.getCluster());
        kicServiceStack.addDependency(clusterStack);
        kicServiceStack.addDependency(rdsStack);
        app.synth();
    }
}

