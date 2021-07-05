package com.example.springioc.class013;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/5 13:37
 */
public class Class013Test {
    @Test
    public void test(){
        //ApplicationContext context = new XmlServletWebServerApplicationContext("spring013.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        Bean1 bean1 = context.getBean("bean1", Bean1.class );
        System.out.println(bean1);
    }

}
