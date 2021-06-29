package soundsystem;

import java.util.List;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/6/29 09:00
 */
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing" + title + " by " + artist);
    }
}
