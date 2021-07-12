package org.javaboy.ioc.cmd;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/12 15:40
 */
public class TestCmd {
    @Test
    public void testCmd(){

        ApplicationContext ctx = new AnnotationConfigApplicationContext(CmdConfig.class);
        ShowCmd cmd = (ShowCmd) ctx.getBean("cmd");
        String s = cmd.showCmd();
        System.out.println("s = " + s);
    }

}
