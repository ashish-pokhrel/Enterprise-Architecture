package edu.miu.cs544;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Greeting {
    @Value("Hello World")
    private String greeting;
    GretTest gretTest;

    public Greeting(GretTest  gretTest){
       this.gretTest = gretTest;
       this.gretTest.show();
    }
    public void sayHello() {
        System.out.println(greeting);
    }
    public String getGreeting() {
        return greeting;
    }
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}