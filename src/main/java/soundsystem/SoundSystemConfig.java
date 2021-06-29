package soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/6/29 11:19
 */
 @Configuration
 @Import(CDPlayerConfig.class)
 @ImportResource("classpath:cd-config.xml")
public class SoundSystemConfig {

}
