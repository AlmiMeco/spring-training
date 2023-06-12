package com.cydeo.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // <- Specifies this annotation is Method Level {@RequestMapping}
@Retention(RetentionPolicy.RUNTIME) // Annotation is READ during RUNTIME
public @interface LoggingAnnotation {





}
