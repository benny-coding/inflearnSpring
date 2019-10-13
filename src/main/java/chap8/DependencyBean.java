package chap8;

public class DependencyBean {
    public InjectionBean injectionBean;

    public DependencyBean(InjectionBean injectionBean){
        System.out.println("DependencyBean : constructor ");
        this.injectionBean = injectionBean;

    }

    public void setInjectionBean(InjectionBean injectionBean) {
        System.out.println("DependencyBean : setter");
        this.injectionBean = injectionBean;
    }
}
