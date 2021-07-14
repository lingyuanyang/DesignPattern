package com.lingyuanyang.designPattern.chainOfResponsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChiefInspector extends Manager {

    public ChiefInspector(String name) {
        super(name);
    }

    GeneralManager superior = new GeneralManager("总经理");

    @Override
    public void setSuperior(Manager superior) {
        super.setSuperior(superior);
    }

    @Override
    public void RequestApplications(Request request) {

        if ("请假".equalsIgnoreCase(request.getRequestType()) && request.getNumber() <= 5) {
            System.out.println(name + ":" + request.getRequestContent() + "数量" + request.getNumber() + "被批准!");
        } else if (superior != null) {
            superior.RequestApplications(request);
        }
    }
}
