package com.fms.app.task;

import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

@Component
public class Notify {

	@Async
	public void asyncMethodWithVoidReturnType() throws Exception{
		Thread.sleep(1000 * 5);
		System.out.println("Execute method asynchronously. Mail Sent  " + Thread.currentThread().getName());
	}

	@Async
	public Future<Boolean> sendMail(String to) throws InterruptedException {
		System.out.println("sending mail.." + to);
		Thread.sleep(1000 * 10);
		System.out.println("sending mail completed");
		return new AsyncResult<Boolean>(true);
	}
}
