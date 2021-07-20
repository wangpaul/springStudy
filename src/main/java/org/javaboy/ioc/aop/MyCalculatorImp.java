package org.javaboy.ioc.aop;

import org.springframework.stereotype.Component;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/20 08:06
 */
@Component
public class MyCalculatorImp implements MyCalculator{
    @Action
    @Override
    public int add(int a, int b) {
        return a + b;
    }


    @Override
    public void min(int a, int b) {
        System.out.println(a + "-" + b + "=" + (a - b));
    }
}
