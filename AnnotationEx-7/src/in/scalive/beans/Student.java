package in.scalive.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    public Student() {
    	System.out.println("Student bean created...");
    }
    public void show() {
    	System.out.println("I am student bean");
    }
}
