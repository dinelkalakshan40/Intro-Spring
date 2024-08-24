package lk.ijse.app;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Logs {

    @After(("execution(public void startTransaction())"))
    public void startTransLog() {
        System.out.println("Start Trans Log");
    }
    @After(("execution(public void endTransaction())"))
    public void endTransLog() {
        System.out.println("End Trans Log");
    }
}
