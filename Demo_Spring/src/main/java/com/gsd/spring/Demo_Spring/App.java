package com.gsd.spring.Demo_Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.BaseballCoach;
import com.demo.spring.Coach;
import com.demo.spring.CricketCoach;
import com.spring.employee.Employee;
 

/**
 * Hello world!
 *
 */
public class App 
{
   /* public static void main( String[] args )
    {  try {
    	
        ClassPathXmlApplicationContext context=new  ClassPathXmlApplicationContext("applicationContext.xml");
        Coach myCoach=context.getBean("theCoach",BaseballCoach.class);
    	System.out.println(myCoach.getDailyWorkout());
    	Coach myCoach1=context.getBean("theCoach",BaseballCoach.class);
    	System.out.println(myCoach==myCoach1);
		
	} catch (Exception e) {
		// TODO: handle exception
	}
    } 
	public static void main( String[] args )
    {  try {
    	
        ClassPathXmlApplicationContext context=new  ClassPathXmlApplicationContext("apllication.xml");
        Employee employee=context.getBean("theCoach__1",Employee.class);
    	System.out.println(employee.toString());
    	
	} catch (Exception e) {
		// TODO: handle exception
	}
    }
	public static void main(String args[])
	{
		
	
	ClassPathXmlApplicationContext context=new 
			ClassPathXmlApplicationContext("aplication1.xml");
	CricketCoach theCoach=context.getBean("theCoach",CricketCoach.class);
	System.out.println(theCoach.getDailyWorkout()+" "+theCoach.getDailyFortune());
	context.close();
}*/
	public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context=
        		new ClassPathXmlApplicationContext("app.xml");
        Coach c=context.getBean("swimCoach",Coach.class);
        System.out.println(c.getDailyWorkout()+"\n"+c.getDailyFortune());
        context.close();
    }
}
