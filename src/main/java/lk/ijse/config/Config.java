package lk.ijse.config;

import lk.ijse.app.Transaction;
import lk.ijse.obj.MyObj;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse")
//@ComponentScan(basePackageClasses = {MyObj.class})
@ComponentScan(basePackageClasses = {Long.class, Transaction.class})
public class Config {


}
