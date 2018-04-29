package com.fms.app.task;

import java.util.concurrent.Future;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) throws Exception {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-hibernate-beans.xml");
		
		Notify notify = context.getBean(Notify.class);
		
		System.out.println("Main Thread Triggering");
		Future future = notify.sendMail("lokithraj@gmail.com");
		Boolean value = (Boolean) future.get();
		System.out.println("Main Thread Ends with " + value);
		
		/*notify.asyncMethodWithVoidReturnType();*/
		System.out.println("Main Thread Ends ");
		
	}
}
