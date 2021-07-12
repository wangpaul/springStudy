package org.javaboy.ioc.cmd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/12 15:38
 */
@Configuration
public class CmdConfig {
    @Bean("cmd")
    @Conditional(WindowsCondition.class)
    ShowCmd winCmd(){
        return new WindowsShowCmd();
    }

    @Bean("cmd")
    @Conditional(MacCondition.class)
    ShowCmd macCmd(){
        return new MacShowCmd();
    }

    @Bean
    @Profile("dev")
    DataSource devDs(){
        DataSource ds = new DataSource();
        ds.setUrl("jdbc:mysql:////vhr");
        ds.setUsername("root");
        ds.setPassword("123");
        return ds;
    }

    @Bean
    @Profile("prod")
    DataSource prodDs(){
        DataSource ds = new DataSource();
        ds.setUrl("jdbc:mysql://192.168.23.56.3306//vhr");
        ds.setUsername("root");
        ds.setPassword("107412");
        return ds;
    }
}
