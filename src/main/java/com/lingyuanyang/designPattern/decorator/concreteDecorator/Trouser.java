package com.lingyuanyang.designPattern.decorator.concreteDecorator;

import com.lingyuanyang.designPattern.decorator.Finery;

public class Trouser extends Finery {

    @Override
    public void show() {
        System.out.println("trouser");
        super.show();
    }
}
