package com.lingyuanyang.designPattern.decorator.concreteDecorator;

import com.lingyuanyang.designPattern.decorator.Finery;

public class Sneakers extends Finery {

    @Override
    public void show() {
        System.out.println("sneakers");
        super.show();
    }
}
