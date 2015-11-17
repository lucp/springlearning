package springlearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"SetterConfig.xml"});

		BasicBean obj = (BasicBean) context.getBean("BasicBean");
		obj.printHello();
		obj.sayInjected();

	}

}
