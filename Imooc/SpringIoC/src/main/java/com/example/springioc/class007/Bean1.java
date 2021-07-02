package com.example.springioc.class007;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/2 14:38
 */
public abstract class Bean1 {
    protected abstract Bean2 createBean2();

    public void printBean2(){
        System.out.println("bean2 = " + createBean2());
    }

}
