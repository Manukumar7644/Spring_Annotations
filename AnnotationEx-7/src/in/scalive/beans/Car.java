package in.scalive.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Car {
   public Car() {
	   System.out.println("Car bean created...");
   }
   public void show() {
	   System.out.println("I am car bean");
   }
}
