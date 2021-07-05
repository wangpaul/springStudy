package com.example.springioc.class015;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/5 20:33
 */
public class Class015Test {
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(TestConfiguration.class);
//        for(int i = 0; i < 10; i++){
//            TestBean testBean1 = context.getBean("testBean1", TestBean.class);
//            System.out.println("testBean1 = " + testBean1);
//        }
//
//        for(int i = 0; i < 10; i++){
//            TestBean testBean2 = context.getBean("testBean2", TestBean.class);
//            System.out.println("testBean2 = " + testBean2);
//        }
        TestBean testBean2 = context.getBean("testBean2", TestBean.class);
        for(int i = 0; i < 10; i++){
            testBean2.printAnotherBean();
        }
    }
}
