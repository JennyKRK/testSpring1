package myexample.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import various.Welcome;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

//		SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		BeanFactory factory = (BeanFactory) context;
		Welcome welcome = (Welcome) factory.getBean("welcome");
		welcome.run();

	}

}
