package com.example.springioc.class006;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/2 11:05
 */
public class Class006Test {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring006.xml");
        //Bean bean =(Bean) context.getBean("bean");
        Bean bean = context.getBean("bean", Bean.class);
        System.out.println("bean.getStringList = " + bean.getStringList());
        System.out.println("bean.getStringSet = " + bean.getStringSet());
        System.out.println("bean.getStringMap = " + bean.getStringMap());
        System.out.println("bean.getAnotherBeanList = " + bean.getAnotherBeanList());
        System.out.println("bean.getAnotherBeanSet = " + bean.getAnotherBeanSet());
        System.out.println("bean.getAnotherBeanMap = " + bean.getAnotherBeanMap());
        System.out.println("bean.getProperties = " + bean.getProperties());
        System.out.println("bean.getAnotherBean2 = " + bean.getAnotherBean2());
    }
}
