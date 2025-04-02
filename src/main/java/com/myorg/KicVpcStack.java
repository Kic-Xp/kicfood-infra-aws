package com.myorg;

import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.ec2.Vpc;
import software.constructs.Construct;

public class KicVpcStack extends Stack {
    private Vpc vpc;
    public KicVpcStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public KicVpcStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        vpc = Vpc.Builder.create(this, "KicVpc")
                .maxAzs(3)  // Default is all AZs in region
                .build();
    }

    public Vpc getVpc() {
        return vpc;
    }
}
