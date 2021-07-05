package com.example.springioc.class010;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/5 07:47
 */
public class Class010Test {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring010.xml");
        System.out.println("context已经被创建" + context);
        Bean bean = context.getBean("bean", Bean.class);
        System.out.println("bean = " + bean);
    }
}
