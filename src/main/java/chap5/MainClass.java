package chap5;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        /*
        TransportationWalk transpotationWalk = new TransportationWalk();
        transpotationWalk.move();
        */

        // # 스프링 컨테이너 접근 방법

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:constructorApplicationContext.xml");

        TransportationWalk transportationWalk = ctx.getBean("tWalk", TransportationWalk.class);
        transportationWalk.move();

        ctx.close();
    }

}
