package org.javaboy.ioc.cmd;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/12 15:35
 */
public class WindowsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String osName = conditionContext.getEnvironment().getProperty("os.name");
        System.out.println(osName);
        return osName.toLowerCase().contains("win");
    }
}
