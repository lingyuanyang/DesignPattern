package com.lingyuanyang.designPattern.builder;

public class BenzBuilder extends Builder {

    //    private Car car = new Car();

    private Benz benz;

    public BenzBuilder() {
        benz = new Benz();
    }

    @Override
    public void buildCarWheel() {
//        car.Add("Benz add Wheel");
        System.out.println("Benz add Wheel");
    }

    @Override
    public void buildSteeringWheel() {

//        car.Add("Benz add SteeringWheel");
        System.out.println("Benz add SteeringWheel");
    }

    @Override
    public void buildEngine() {
//        car.Add("Benz add engine");
        System.out.println("Benz add engine");
    }

    @Override
    public void buildCarFrame() {
//        car.Add("Benz add frame");
        System.out.println("Benz add frame");
    }

    @Override
    public Car1 GetCar() {
        return benz;
    }
}
