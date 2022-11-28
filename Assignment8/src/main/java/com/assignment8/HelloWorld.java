package com.assignment8;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
public class HelloWorld {
	String message;
   public String getMessage() {
         return message;
     }
   public void setMessage(String message) {
         this.message = message;
     }
     public void myInit() {
         System.out.println("My custom initialization");
     }
     public void myDestroy() {
         System.out.println("My custom destroy");
     }
     
     @PostConstruct
     public void myJavaInit() {
         System.out.println("My Java initialization");
     }
     @PreDestroy
     public void myJavaDestroy() {
         System.out.println("My Java destroy");
     }
}