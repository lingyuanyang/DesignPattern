package com.lingyuanyang.designPattern.builder;


public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void Construct(Builder builder) {
        builder.buildCarWheel();
        builder.buildSteeringWheel();
        builder.buildEngine();
        builder.buildCarFrame();
    }
}
