package chap8;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {

        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext("classpath:chap8.SingletonApplicationContext.xml");

        InjectionBean injectionBean =
                ctx.getBean("injectionBean", InjectionBean.class);

        DependencyBean DependencyBean1 =
                ctx.getBean("DependencyBean", DependencyBean .class);

        DependencyBean DependencyBean2 =
                ctx.getBean("DependencyBean", DependencyBean .class);

        if(DependencyBean1.equals(DependencyBean2)){
            System.out.println("DependencyBean1 == DependencyBean2");
        } else {
            System.out.println("DependencyBean1 != DependencyBean2");
        }


        ctx.close();
    }
}
