package org.javaboy.ioc.cmd;

import lombok.val;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/12 17:10
 */
public class TestProfile {
    @Test
    public void testProfile(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("prod");
        ctx.register(CmdConfig.class);
        ctx.refresh();
        val ds = ctx.getBean(DataSource.class);
        System.out.println("ds = " + ds);
    }
}
