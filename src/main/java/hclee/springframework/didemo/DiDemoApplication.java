package hclee.springframework.didemo;

import hclee.springframework.didemo.controllers.ConstructorInjectedController;
import hclee.springframework.didemo.controllers.GetterInjectedController;
import hclee.springframework.didemo.controllers.MyController;
import hclee.springframework.didemo.controllers.PropertyInjectedController;
import hclee.springframework.didemo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = {"hclee.springframework.didemo"})
@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        final ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        final MyController controller = ctx.getBean("myController", MyController.class);
        final FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource);
    }
}
