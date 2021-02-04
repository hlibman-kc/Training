package com.training.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(* com.training.spring.aop.springaop.data.*.*(..))")
    public void dataLayerExecution() {}

    @Pointcut("execution(* com.training.spring.aop.springaop.business.*.*(..))")
    public void businessLayerExecution() {}

    @Pointcut("com.training.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution() &&" +
            "com.training.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
    public void allLayerExecution(){}

    @Pointcut("bean(*dao*)")
    public void beanContainingWithDao(){}

    @Pointcut("within(com.training.spring.aop.springaop.data..*)")
    public void dataLayerExecutionWithWithin() {}

    @Pointcut("@annotation(com.training.spring.aop.springaop.aspect.TrackTime)")
    public void trackTimeAnnotation() {}
}
