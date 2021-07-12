package org.javaboy.ioc.cmd;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/12 15:33
 */
public class MacShowCmd implements ShowCmd{
    @Override
    public String showCmd() {
        return "ls";
    }
}
