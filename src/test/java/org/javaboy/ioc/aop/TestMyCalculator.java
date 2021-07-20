package org.javaboy.ioc.aop;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/20 08:14
 */
public class TestMyCalculator {
    @Test
    public void testMyCalculator() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        //使用类会表错，APO使用jdk动态代理。原因是：如果目标对象实现了接口，默认情况下会采用JDK的动态代理实现AOP
        //可以@EnableAspectJAutoProxy（proxyTargetClass= true）
        //MyCalculator myCalculatorImp = context.getBean(MyCalculatorImp.class);
        MyCalculator myCalculatorImp = context.getBean(MyCalculator.class);
        myCalculatorImp.add(5, 6);
        myCalculatorImp.min(5, 6);
    }
}
