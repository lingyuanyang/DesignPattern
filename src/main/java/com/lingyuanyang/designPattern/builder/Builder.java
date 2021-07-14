package com.lingyuanyang.designPattern.builder;

abstract class Builder {

    public abstract void buildCarWheel();
    public abstract void buildSteeringWheel();
    public abstract void buildEngine();
    public abstract void buildCarFrame();

    public abstract Car1 GetCar();

}
