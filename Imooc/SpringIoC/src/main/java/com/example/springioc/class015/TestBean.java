package com.example.springioc.class015;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/5 20:34
 */
@Component("testBean2")
@Scope("singleton")
public abstract class TestBean {

    @Lookup
    public abstract  AnotherBean anotherBean();

    public void printAnotherBean(){
        System.out.println("anotherBean() = " + anotherBean());
    }
}
