package com.example.springioc.class014;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/5 16:13
 */
@Component
public class MyBean {
    private AnotherBean anotherBean1;
    private AnotherBean anotherBean2;

    @Autowired
    private AnotherBean anotherBean3;

    public AnotherBean getAnotherBean2() {
        return anotherBean2;
    }

    @Autowired
    public void setAnotherBean2(AnotherBean anotherBean2) {
        this.anotherBean2 = anotherBean2;
    }

    @Autowired
    public MyBean(AnotherBean anotherBean1) {
        this.anotherBean1 = anotherBean1;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "anotherBean1=" + anotherBean1 +
                ", anotherBean2=" + anotherBean2 +
                ", anotherBean3=" + anotherBean3 +
                '}';
    }
}
