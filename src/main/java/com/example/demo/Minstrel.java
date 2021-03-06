package com.example.demo;

import java.io.PrintStream;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/6/25 11:14
 */
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest(){
        stream.println("Fa la la, the knight is so brave!");
    }

    public void singAfterQuest(){
        stream.println("Tee hee hee, the brave knight" + "did embark on a quest");
    }
}
