package com.lingyuanyang.designPattern.chainOfResponsibility;

public class Client {
    /*
     * 职责链模式 --> Chain of Responsibility
     */
    public static void main(String[] args) {

        CommonManager commonManager = new CommonManager("经理");
        ChiefInspector chiefInspector = new ChiefInspector("总监");
        GeneralManager generalManager = new GeneralManager("总经理");
        //责任链的首尾关系可在客户端自定义，也可在各个链条中指定
//        commonManager.setSuperior(chiefInspector);
//        chiefInspector.setSuperior(generalManager);

        Request request1 = new Request();
        request1.setRequestContent("leiyubing请假");
        request1.setRequestType("请假");
        request1.setNumber(2);

        Request request2 = new Request();
        request2.setRequestContent("lingyuanyang请假");
        request2.setRequestType("请假");
        request2.setNumber(4);

        Request request3 = new Request();
        request3.setRequestContent("zhangxinrong请假");
        request3.setRequestType("请假");
        request3.setNumber(10);

        Request request4 = new Request();
        request4.setRequestContent("shengshunyan加薪");
        request4.setRequestType("加薪");
        request4.setNumber(500);

        Request request5 = new Request();
        request5.setRequestContent("yuanyingtai加薪");
        request5.setRequestType("加薪");
        request5.setNumber(100);

        commonManager.RequestApplications(request1);
        commonManager.RequestApplications(request2);
        commonManager.RequestApplications(request3);
        commonManager.RequestApplications(request4);
        commonManager.RequestApplications(request5);
    }
}
