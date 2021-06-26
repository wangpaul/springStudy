package com.example.demo;

import java.io.PrintStream;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/6/25 10:48
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
