package com.cydeo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    Logger logger = LoggerFactory.getLogger(LoggingAspect.class);


//    Defining Pointcut-Expression (which methods will be intercepted by our AOP functions)
//    @Pointcut("execution(* com.cydeo.controller.CourseController.*())")
//    public void myPointCut(){}

//    Defining Advice (When will the interception happen && What will be the outcome)
//    @Before("myPointCut()")
//    public void log(){
//        logger.info("Info Log (executing BEFORE method)...............");
//    }

//======================================================================================================================
                            /* Different Impl Of AOP ADVICE Functions */
//======================================================================================================================

//    Passing On Values using JoinPoint {1}{2}{3}

//    @Pointcut("execution(* com.cydeo.repository.CourseRepository.findById(*))")
//    public void courseRepositoryFindByIdPC() {}
//
//    @Before("courseRepositoryFindByIdPC()")
//    public void logWithJoinInfo(JoinPoint joinPoint){
//        logger.info("Logged before method -> {}, Arguments of method -> {}, Target of method -> {}"
//        , joinPoint.getSignature(), joinPoint.getArgs(), joinPoint.getTarget());
//    }
//  -> Logged before method -> Optional org.springframework.data.repository.CrudRepository.findById(Object), Arguments of method -> [2], Target of method -> org.springframework.data.jpa.repository.support.SimpleJpaRepository@198a5154

//======================================================================================================================

//    Passing on Values {AFTER} method exec. -> AfterAReturningAdvice

    /* Using @AfterReturning we can also CAPTURE & RETURN the RESULT of our AOP interception */


    @Pointcut("execution(* com.cydeo.repository.CourseRepository.findById(*))")
    public void courseRepositoryFindByIdPC() {}

    @AfterReturning(pointcut = "courseRepositoryFindByIdPC()", returning = "result")
    public void logPassedAfterMethodExec(Object result){
        logger.info("After Method Is Executed return RESULT -> {} ", result.toString());
    }
//    After Method Is Executed return RESULT -> Optional[Course(id=2, name=Getting Started with Spring Security DSL, category=Spring, rating=3, description=Learn Spring Security DSL in easy steps)]

//======================================================================================================================

//    Choosing PointCut w/ Custom Annotation[s] (ANY methods annotated w/ our custom annotation will be intercepted by AOP)

//    @Pointcut("@annotation(com.cydeo.annotations.LoggingAnnotation)")
//    public void loggingAnnotation(){}

//    @Before("loggingAnnotation()")
//    public void logWithCustomAnnot(JoinPoint joinPoint){
//        logger.info("Logged before method -> {}, Arguments of method -> {}, Target of method -> {}"
//        , joinPoint.getSignature(), joinPoint.getArgs(), joinPoint.getTarget());
//    }

//======================================================================================================================



}
