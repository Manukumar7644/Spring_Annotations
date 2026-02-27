package in.scalive.samplebeans;

import org.springframework.stereotype.Component;

@Component
public class Car {
   public Car() {
	   System.out.println("Car bean created...");
   }
   public void show() {
	   System.out.println("I am car bean");
   }
}
