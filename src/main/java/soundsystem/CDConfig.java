package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/6/29 11:09
 */
@Configuration
public class CDConfig{
        @Bean
        public CompactDisc compactDisc(){
            return new SgtPeppers();
        }
}
