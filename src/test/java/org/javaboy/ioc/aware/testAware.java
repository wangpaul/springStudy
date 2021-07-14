package org.javaboy.ioc.aware;

import lombok.val;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/13 14:24
 */
public class testAware {
    @Test
    public void testAware() throws IOException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AwareConfig.class);
        val bean = applicationContext.getBean("awareService", AwareService.class);
        bean.output();
    }
}
