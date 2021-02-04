package com.training.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class MethodExecutionCalculationAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("com.training.spring.aop.springaop.aspect.CommonJoinPointConfig.trackTimeAnnotation()")
    public void afterReturning(ProceedingJoinPoint joinPoint) throws Throwable {
        //startTime = x
        long startTime = System.currentTimeMillis();
        //allow execution of method
        joinPoint.proceed();
        //endTime =y
        long timeTaken = System.currentTimeMillis() - startTime;



        logger.info("Time Taken by {} is {}", joinPoint, timeTaken);
    }
}
