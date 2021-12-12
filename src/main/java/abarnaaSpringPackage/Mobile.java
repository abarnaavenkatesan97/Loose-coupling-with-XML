package abarnaaSpringPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("myspring.xml");
		Sim sim = (Sim) context.getBean("abc");
		sim.calling();
		sim.data();
	}


}
