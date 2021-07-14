package org.javaboy.ioc.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/13 08:34
 */
@Service
@PropertySource(value = "javaboy.properties")
public class AwareService implements BeanNameAware, BeanFactoryAware, ResourceLoaderAware, EnvironmentAware {
    private String beanName;
    private ResourceLoader resourceLoader;
    private Environment environment;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void output() throws IOException {
        System.out.println("beanName:"  + beanName);
        Resource resource = resourceLoader.getResource("javaboy.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
        String s = bufferedReader.readLine();
        System.out.println(s);
        bufferedReader.close();
        String address = environment.getProperty("javaboy.address");
        System.out.println("address = " + address );
    }
}
