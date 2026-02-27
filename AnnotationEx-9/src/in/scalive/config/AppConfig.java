package in.scalive.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import in.scalive.beans.Car;
import in.scalive.beans.Student;

@Configuration
public class AppConfig {

	@Bean(name="scholar")
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Student student() {
		Student student=new Student();
		return student;
	}
	@Bean(name="vehicle")
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Car car() {
		Car car=new Car();
		return car;
	}
}
