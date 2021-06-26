package soundsystem;

import org.springframework.stereotype.Component;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/6/25 15:08
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "wzz";
    private String artist = "cc";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
