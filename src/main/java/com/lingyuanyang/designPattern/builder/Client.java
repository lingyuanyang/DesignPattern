package com.lingyuanyang.designPattern.builder;

public class Client {
    /*
     * 建造者模式/构造器模式 --> builder
     */
    public static void main(String[] args) {
//        Director director = new Director();

//        Builder benzBuilder = new BenzBuilder();
//        Builder audiBuilder = new AudiBuilder();
//
//        director.Construct(benzBuilder);
//        Car benz = benzBuilder.GetCar();
//        benz.show();

//        director.Construct(audiBuilder);
//        Car audi = audiBuilder.GetCar();
//        audi.show();

        Builder benzBuilder = new BenzBuilder();
        Builder audiBuilder = new AudiBuilder();

        Director director = new Director(benzBuilder);
        director.Construct(benzBuilder);
        Car1 benz = benzBuilder.GetCar();
        benz.run();

        director.Construct(audiBuilder);
        Car1 audi = audiBuilder.GetCar();
        audi.run();
    }
}
