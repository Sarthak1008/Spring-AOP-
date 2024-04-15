# Spring AOP Execution Time Tracker

## Description

The **Spring AOP Execution Time Tracker** project demonstrates how to use Spring AOP (Aspect-Oriented Programming) to track method execution time in a Spring Boot application. By leveraging Spring AOP, this project provides a reusable aspect that intercepts method invocations, measures their execution time, and logs the duration.

## Key Components

1. **Custom Annotation**: Defines a custom annotation `@TrackExecutionTime` that is used to annotate methods for which execution time tracking is desired.

2. **Aspect**: Implements an aspect class (`ExecutionTimeTrackerAspect`) that intercepts methods annotated with `@TrackExecutionTime`, measures their execution time, and logs the duration.

3. **Spring Boot Application**: Includes a Spring Boot application with example service classes and methods annotated with `@TrackExecutionTime` to demonstrate the aspect in action.

## How to Use

1. **Annotate Methods**: Annotate the methods in your Spring application that you want to track execution time for with `@TrackExecutionTime`.

   ```java
   import org.springframework.stereotype.Service;
   import com.example.TrackExecutionTime;

   @Service
   public class MyService {

       @TrackExecutionTime
       public void methodToTrackExecutionTime() {
           // Method logic
       }
   }
