package com.example.Spring.AOP.TrackExecutionTime.advice;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Firstly we will create a annotation class and here below is how we create an annotation class 

// We Also need to add few annotation to tell our class what kinda annotation class are we creating

@Target(ElementType.METHOD) // Here we mention at what level do we want it to implement for
                            // field,parameter,method lable,constructor level,etc

// Next is you mention retention
/*
 * Indicates how long annotations with the annotated interface are to be
 * retained. If no Retention annotation is present on an annotation
 * interface declaration, the retention policy defaults to
 * RetentionPolicy.CLASS.
 */

/*
 * Annotation retention policy. The constants of this enumerated class describe
 * the various policies for retaining annotations. They are used
 * in conjunction with the Retention meta-annotation interface to specify how
 * long annotations are to be retained.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface TrackExecutionTime {

}