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
		Student s1=(Student)container.getBean("mystudent");
		Student s2=(Student)container.getBean("mystudent");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);
	}
}
