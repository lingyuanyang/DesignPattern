package com.lingyuanyang.designPattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Car {

    List<String> parts = new ArrayList<>();

    public void Add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("\n产品，创建");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
