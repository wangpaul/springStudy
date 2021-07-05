package com.example.springioc.class007;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/2 14:36
 */
public class Class007Test {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring007.xml");
        //Bean bean =(Bean) context.getBean("bean");
        Bean2 bean2_1 = context.getBean("bean2", Bean2.class);
        System.out.println("bean2_1 = " + bean2_1);

        Bean2 bean2_2 = context.getBean("bean2", Bean2.class);
        System.out.println("bean2_2 = " + bean2_2);

        Bean1 bean1 = context.getBean("bean1", Bean1.class);
        System.out.println("bean1 = " + bean1);

        bean1.printBean2();
        bean1.printBean2();
        bean1.printBean2();
        bean1.printBean2();


//        ApplicationContext context1 = new ClassPathXmlApplicationContext("spring007.xml");
//        //Bean bean =(Bean) context.getBean("bean");
//        Bean2 bean2_3 = context1.getBean("bean2", Bean2.class);
//        System.out.println("bean2_3 = " + bean2_3);
//
//        Bean2 bean2_4 = context1.getBean("bean2", Bean2.class);
//        System.out.println("bean2_4 = " + bean2_4);
//
//        Bean1 bean1_2 = context1.getBean("bean1", Bean1.class);
//        System.out.println("bean1_2 = " + bean1_2);

    }
}
