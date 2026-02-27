package in.scalive.beans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Student {
	int roll=10;
	String name="Ravi";
    public Student() {
    	System.out.println("Student bean created...");
    }
    public void show() {
    	System.out.println("Roll="+roll+",Name:"+name);
    	System.out.println("I am student bean");
    }
}
