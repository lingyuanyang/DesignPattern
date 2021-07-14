package com.lingyuanyang.designPattern.chainOfResponsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GeneralManager extends Manager {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void RequestApplications(Request request) {

        if ("请假".equalsIgnoreCase(request.getRequestType())) {
            System.out.println(name + ":" + request.getRequestContent() + "数量" + request.getNumber() + "被批准!");
        } else if ("加薪".equalsIgnoreCase(request.getRequestType()) && request.getNumber() <= 500) {
            System.out.println(name + ":" + request.getRequestContent() + "数量" + request.getNumber() + "被批准!");
        } else if ("加薪".equalsIgnoreCase(request.getRequestType()) && request.getNumber() > 500) {
            System.out.println(name + ":" + request.getRequestContent() + "数量" + request.getNumber() + "再说吧!");
        }
    }
}
