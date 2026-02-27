package in.scalive.beans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Car {
   public Car() {
	   System.out.println("Car bean created...");
   }
   public void show() {
	   System.out.println("I am car bean");
   }
}
