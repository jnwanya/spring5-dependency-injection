package com.jnwanya;

import com.jnwanya.controllers.ConstructorInjectedController;
import com.jnwanya.controllers.MyController;
import com.jnwanya.controllers.PropertyInjectedController;
import com.jnwanya.controllers.SetterInjectedController;
import com.jnwanya.examplebeans.FakeDataSource;
import com.jnwanya.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.jnwanya"})
public class DiDemoApplication {

	public static void main(String[] args) {


		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource =  ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.toString());

        FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.toString());

        /*System.out.println(myController.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).greetUser());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayGreetingToUser());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).greetUser());

        */
    }
}
