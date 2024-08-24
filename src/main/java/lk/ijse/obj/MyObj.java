package lk.ijse.obj;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("MyObj")
//@Scope(ConfigurableListableBeanFactory.SCOPE_SINGLETON) //by default

public class MyObj {
    public MyObj() {
        System.out.println("Hello MyObj");
    }
}
