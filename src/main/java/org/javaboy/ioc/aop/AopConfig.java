package org.javaboy.ioc.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/20 08:13
 */
@Configuration
@ComponentScan
//@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableAspectJAutoProxy
public class AopConfig {
}
