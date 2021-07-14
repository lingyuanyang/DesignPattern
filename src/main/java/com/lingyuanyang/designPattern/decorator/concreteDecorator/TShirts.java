package com.lingyuanyang.designPattern.decorator.concreteDecorator;

import com.lingyuanyang.designPattern.decorator.Finery;
import com.lingyuanyang.designPattern.decorator.Person;

public class TShirts extends Finery {

    @Override
    public void show() {
        System.out.println("T-shirts");
        super.show();
    }
}
