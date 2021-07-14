package com.lingyuanyang.designPattern.builder;

public class AudiBuilder extends Builder {

//    private Car car = new Car();

    private Audi audi;

    public AudiBuilder() {
        audi = new Audi();
    }

    @Override
    public void buildCarWheel() {
//        car.Add("Audi add Wheel");
        System.out.println("Audi add Wheel");
    }

    @Override
    public void buildSteeringWheel() {

//        car.Add("Audi add SteeringWheel");
        System.out.println("Audi add SteeringWheel");
    }

    @Override
    public void buildEngine() {
//        car.Add("Audi add engine");
        System.out.println("Audi add engine");
    }

    @Override
    public void buildCarFrame() {
//        car.Add("Audi add frame");
        System.out.println("Audi add frame");
    }

    @Override
    public Car1 GetCar() {
        return audi;
    }
}
