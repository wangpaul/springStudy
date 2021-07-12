package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/7 16:28
 * javaconfig类
 */
@Configuration
public class CDPlayerConfig2 {
    @Bean
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }

    @Bean
    public CompactDisc randomBeatlesCD(){
        int choice = (int) Math.floor(Math.random() * 4);
        if(choice == 0){
            return new SgtPeppers();
        }else {
            return null;
        }
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }
}

