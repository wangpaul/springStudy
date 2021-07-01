package com.atguigu;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/6/30 14:36
 */
public class PersonTest {
    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("META-INF/spring/person.xml");
        //Person bean = (Person) ac.getBean("person");
        Person bean = ac.getBean(Person.class);
        System.out.println(bean);
    }
}
