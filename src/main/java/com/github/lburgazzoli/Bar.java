package com.github.lburgazzoli;

import java.util.List;

import org.apache.camel.spi.Configurer;

@Configurer
public class Bar {
    private List<String> names;

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
