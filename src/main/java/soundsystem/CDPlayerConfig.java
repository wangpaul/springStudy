package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/6/25 15:11
 */
@Configuration
/** @ComponentScan */
public class CDPlayerConfig {
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }
}
