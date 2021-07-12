package org.javaboy.ioc.javaconfig.service;

import org.javaboy.ioc.javaconfig.JavaConfig;
import org.javaboy.ioc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/12 09:00
 */
public class UserServiceTest {
    private UserService userService;

    @Test
    public void testGetUsers(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        UserService userService = ctx.getBean("userService", UserService.class);
        List<String> allUsers = userService.getUsers();
        System.out.println(allUsers);
    }
}
