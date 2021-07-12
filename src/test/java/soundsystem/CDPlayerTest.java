package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/6/25 15:14
 */
//测试开始的时候自动创建Spring的应用上下文
@RunWith(SpringJUnit4ClassRunner.class)
//告诉需要在CDPlayerConfig中加载配置
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private CompactDisc cd;

    @Autowired
    private MediaPlayer mediaPlayer;

    @Test
    public void cdShouldNotBeNull(){
        //断言cd属性不为null
        assertNotNull(cd);
    }

    @Test
    public void play(){
        mediaPlayer.play();
    }

}
