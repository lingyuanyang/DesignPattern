package com.lingyuanyang.designPattern.chainOfResponsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommonManager extends Manager {

    public CommonManager(String name) {
        super(name);
    }

    ChiefInspector superior = new ChiefInspector("总监");

    @Override
    public void setSuperior(Manager superior) {
        super.setSuperior(superior);
    }

    @Override
    public void RequestApplications(Request request) {

        if ("请假".equalsIgnoreCase(request.getRequestType()) && request.getNumber() <= 2) {
            System.out.println(name + ":" + request.getRequestContent() + "数量" + request.getNumber() + "被批准!");
        } else if (superior != null) {
            superior.RequestApplications(request);
        }
    }
}
