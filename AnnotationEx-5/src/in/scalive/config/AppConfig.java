package in.scalive.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.scalive.beans.Car;
import in.scalive.beans.Student;

@Configuration
public class AppConfig {

	@Bean
	public Student mystudent() {
		Student student=new Student();
		return student;
	}
	@Bean
	public Car car() {
		Car car=new Car();
		return car;
	}
}
