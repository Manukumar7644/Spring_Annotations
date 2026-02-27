package in.scalive.beans;

import org.springframework.stereotype.Component;


public class Student {
    public Student() {
    	System.out.println("Student bean created...");
    }
    public void show() {
    	System.out.println("I am student bean");
    }
}
