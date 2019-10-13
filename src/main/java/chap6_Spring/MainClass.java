package chap6_Spring;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.HashMap;
import java.util.LinkedList;


public class MainClass {
    public static void main(String[] args) {

        LinkedList<String> listData = new LinkedList<String>();
        HashMap<String, String> hsahmapData = new HashMap<String, String>();

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("claspath:constructorApplicationContext.xml");

        StudentRegisterService registerService = ctx.getBean("registerService", StudentRegisterService.class);
        registerService.setListData(listData);
        System.out.println(registerService.listData);
    }
}
