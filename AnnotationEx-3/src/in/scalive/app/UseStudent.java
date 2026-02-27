package in.scalive.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.scalive.demobeans.Student;
import in.scalive.samplebeans.Car;

public class UseStudent {
	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("/in/scalive/resources/beanconf.xml");
		
		System.out.println("Container started");
		Student s=(Student)container.getBean("student");
		s.show();
		Car car=(Car)container.getBean("car");
		car.show();

	}
}
