package com.fms.app.task;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;

// @EnableAsync
// @Configuration
// @ComponentScan("com.fms.app.task")
public class AppConfig {

	//@Bean
	public Executor taskExecutor() {
		return new SimpleAsyncTaskExecutor();
	}
}
