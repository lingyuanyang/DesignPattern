package com.lingyuanyang.designPattern.decorator;

import com.lingyuanyang.designPattern.decorator.concreteDecorator.Sneakers;
import com.lingyuanyang.designPattern.decorator.concreteDecorator.Trouser;
import com.lingyuanyang.designPattern.decorator.concreteDecorator.TShirts;

public class Starter {
    /*
     * 装饰模式 --> decorator
     */
    public static void main(String[] args) {

        Person lyy = new Person("lingyuanyang");

        System.out.println("\n第一种装扮：");

        Trouser bigTrouser = new Trouser();
        TShirts tShirts = new TShirts();
        Sneakers sneakers = new Sneakers();

        bigTrouser.decorate(lyy);
        tShirts.decorate(bigTrouser);
        tShirts.show();

        System.out.println("\n第二种装扮：");

        tShirts.decorate(lyy);
        bigTrouser.decorate(tShirts);
        sneakers.decorate(bigTrouser);
        sneakers.show();
    }
}
