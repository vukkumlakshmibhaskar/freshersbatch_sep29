package com.Ass8;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
* Hello world!
*
*/
@SuppressWarnings("unused")
public class App
{
     public static void main( String[] args )
     {
         @SuppressWarnings("resource")
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
         hellowworld hw = context.getBean(hellowworld.class);
         System.out.println(hw.getMessage());
         context.registerShutdownHook();
         }
     }