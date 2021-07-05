package com.example.springioc.class012;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/5 11:26
 */
public class Class012Test {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring012.xml");
        Class1 class1 = context.getBean("class1", Class1.class);
        Class2 class2 = context.getBean("class2", Class2.class);
        //ParentClass parentClass = context.getBean("parentclass", ParentClass.class);
        System.out.println("Class1:" + class1);
        System.out.println("Class2:" + class2);

    }
}
