package in.scalive.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.scalive.beans.Car;
import in.scalive.beans.Student;
import in.scalive.config.AppConfig;

public class UseStudent {
	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("Container started");
		Student s1=(Student)container.getBean("scholar");
		Student s2=(Student)container.getBean("scholar");
		Car c1=(Car)container.getBean("vehicle");
		Car c2=(Car)container.getBean("vehicle");
	    System.out.println(s1.hashCode());
	    System.out.println(s2.hashCode());
	    System.out.println(s1==s2);
	    System.out.println(c1.hashCode());
	    System.out.println(c2.hashCode());
	    System.out.println(c1==c2);
	    
	}
}
