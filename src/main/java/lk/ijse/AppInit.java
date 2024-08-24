package lk.ijse;

import lk.ijse.config.Config;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(Config.class);
        ctx.refresh();
        var myObj = ctx.getBean("myObj");
        System.out.println(myObj);
        ConfigurableListableBeanFactory beanFactory = ctx.getBeanFactory();
        System.out.println("Is bean singleton "+ beanFactory.isSingleton("myObj"));
        ctx.registerShutdownHook();
    }
}
