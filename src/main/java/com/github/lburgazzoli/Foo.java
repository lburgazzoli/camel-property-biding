package com.github.lburgazzoli;

import java.util.List;

import org.apache.camel.spi.Configurer;

@Configurer
public class Foo {
    private List<Bar> bars;

    public List<Bar> getBars() {
        return bars;
    }

    public void setBars(List<Bar> bars) {
        this.bars = bars;
    }
}
