package com.spring2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
* Hello world!
*
*/
public class Test
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
       // calling list of answer
       Question question =(Question)context.getBean("Question");
       question.displayAnswerList();
       // calling set of answer
        System.out.println("=====================================");
        Question question1 =(Question)context.getBean("Question1");
        question1.displayAnswerSet();
       // calling map of answer
        System.out.println("=====================================");
        Question question2 =(Question)context.getBean("Question2");
        question2.displayAnswerMap();
    }
}