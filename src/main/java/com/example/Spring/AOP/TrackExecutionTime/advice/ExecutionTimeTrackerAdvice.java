package com.example.Spring.AOP.TrackExecutionTime.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect // Aspect declaration

/*
 * Indicates that the annotated class is a component.
 * 
 * Such classes are considered as candidates for auto-detection when using
 * annotation-based configuration and classpath scanning.
 * 
 * A component may optionally specify a logical component name via the value
 * attribute of this annotation.
 * 
 * Other class-level annotations may be considered as identifying a component as
 * well, typically a special kind of component — for example, the @Repository
 * annotation or AspectJ's @Aspect annotation. Note, however, that the @Aspect
 * annotation does not automatically make a class eligible for classpath
 * scanning.
 */

@Component

// Create an aspect class that defines the cross-cutting concern, in this case,
// logging method execution time.
public class ExecutionTimeTrackerAdvice {

    Logger logger = LoggerFactory.getLogger(ExecutionTimeTrackerAdvice.class);

    @Around("@annotation(com.javatechie.spring.aop.api.advice.TrackExecutionTime)")
    public Object trackTime(ProceedingJoinPoint pjp /*
                                                     * ProceedingJoinPoint exposes the proceed(..) method in order to
                                                     * support around advice in
                                                     */) throws Throwable {
        long stratTime = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long endTime = System.currentTimeMillis();
        logger.info("Method name" + pjp.getSignature() + " time taken to execute : " + (endTime - stratTime));
        return obj;
    }

}