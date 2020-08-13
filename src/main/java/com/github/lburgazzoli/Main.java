package com.github.lburgazzoli;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.ExtendedCamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.support.PropertyBindingSupport;

public class Main {
    public static void main(String[] args) {
        CamelContext context = new DefaultCamelContext();
        context.adapt(ExtendedCamelContext.class).getBeanIntrospection().setExtendedStatistics(true);

        try {
            Foo target = new Foo();

            PropertyBindingSupport.build()
                .withCamelContext(context)
                .withTarget(target)
                .withProperties(Map.of(
                    "bars[0]", "#class:" + Bar.class.getName(),
                    "bars[0].names[0]", "a",
                    "bars[0].names[1]", "b"
                ))
                .withRemoveParameters(false)
                .withConfigurer(new FooConfigurer())
                .bind();
        } finally {
            context.stop();
        }
    }
}
