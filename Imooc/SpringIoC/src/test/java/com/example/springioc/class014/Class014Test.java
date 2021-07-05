package com.example.springioc.class014;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/5 16:13
 */
public class Class014Test {
    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        MyBean myBean = context.getBean("myBean", MyBean.class);
        System.out.println("myBean = " + myBean );
    }
}
