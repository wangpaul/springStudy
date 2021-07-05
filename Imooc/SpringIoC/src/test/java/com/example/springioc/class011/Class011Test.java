package com.example.springioc.class011;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/5 09:46
 */
public class Class011Test {
    @Test
    public void test() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring011.xml");
        Bean bean = context.getBean("bean", Bean.class);
        System.out.println("bean = " + bean);
        context.close();
    }
}
