import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Student;

public class Test {

	public static void main(String[] args) {
		
	ApplicationContext c=new ClassPathXmlApplicationContext("applicationContext.xml");
	Student s=(Student) c.getBean("student");
	
	System.out.println(s);

	}

}
