package org.javaboy.ioc.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/20 08:10
 */
@Component
@Aspect
public class LogAspect {
    @Before("@annotation(Action)")
    public void before(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法开始执行了...");
    }

    @After("@annotation(Action)")
    public void after(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法执行结束..." );
    }

    @AfterReturning(value = "@annotation(Action)", returning = "r")
    public void returning(JoinPoint joinPoint, Integer r) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法的返回通知：" + r);
    }

    @AfterThrowing(value = "@annotation(Action)", throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Exception e) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "异常通知：" + e.getMessage());
    }

    @Around("@annotation(Action)")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object proceed = proceedingJoinPoint.proceed();
        return proceed;
    }
}
