package in.scalive.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.scalive.beans.Car;
import in.scalive.beans.Student;

@Configuration
public class AppConfig {

	@Bean(name="scholar")
	public Student student() {
		Student student=new Student();
		return student;
	}
	@Bean(name="vehicle")
	public Car car() {
		Car car=new Car();
		return car;
	}
}
