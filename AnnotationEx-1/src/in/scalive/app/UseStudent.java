package in.scalive.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.scalive.beans.Student;

public class UseStudent {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext();
		container.register(Student.class);
		container.refresh();
		System.out.println("Container started");
		Student s=(Student)container.getBean("student");
		s.show();
	}
}
