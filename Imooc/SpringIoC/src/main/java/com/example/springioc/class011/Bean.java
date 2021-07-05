package com.example.springioc.class011;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/5 09:49
 */
public class Bean implements InitializingBean, DisposableBean {
    public void onInit(){
        System.out.println("Bean.onInit");

    }

    public void onDestroy(){
        System.out.println("Bean.Destroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean.afterPropertiesSet");
    }
}
