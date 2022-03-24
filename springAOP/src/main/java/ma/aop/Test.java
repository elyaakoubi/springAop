package ma.aop;

import ma.aop.service.IServiceModel;
import ma.aop.service.ServiceModel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springContext.xml");
        IServiceModel sm =(ServiceModel) ctx.getBean("serviceModel");
       // IServiceModel sm = new ServiceModel();
        sm.doSeomething();


    System.out.println("....");
    }
}
