package hclee.springframework.didemo;

import hclee.springframework.didemo.controllers.ConstructorInjectedController;
import hclee.springframework.didemo.controllers.GetterInjectedController;
import hclee.springframework.didemo.controllers.MyController;
import hclee.springframework.didemo.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        final ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = ctx.getBean("myController", MyController.class);

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
