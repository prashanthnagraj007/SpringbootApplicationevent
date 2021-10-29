package com.javacodegeeks.example;

import com.javacodegeeks.example.event.AppEventA;
import com.javacodegeeks.example.publisher.AppEventAPublisher;
import com.javacodegeeks.example.source.EventSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) throws InterruptedException {
		//SpringApplication.run(HelloWorldApplication.class, args);
		ApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args);

		AppEventAPublisher eventAPublisher = (AppEventAPublisher)context.getBean("appEventAPublisher");

		eventAPublisher.publish(new AppEventA(new EventSource()));


		TimeUnit.MINUTES.sleep(1);
	}
}
