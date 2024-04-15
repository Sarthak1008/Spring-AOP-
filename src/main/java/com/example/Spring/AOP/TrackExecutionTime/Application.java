package com.example.Spring.AOP.TrackExecutionTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	/*
	 * We need this ExecutionTimeTrackerAspect aspect to intercept methods annotated
	 * with @TrackExecutionTime, log their execution time, and proceed with the
	 * method execution as usual. This allows you to track the execution time of
	 * specific methods in your Spring application. Because yes , we can do it
	 * separtely by printing before and after the method is executed but let's say
	 * we want it for all the methods , so that would be a tedious task , so to
	 * prevent that we can create a separate that particular logic . For that we are
	 * creating this @TrackExecutionTime annotation
	 */

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
