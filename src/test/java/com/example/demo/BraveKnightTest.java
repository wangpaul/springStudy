package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/6/25 10:45
 */
public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest(){
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}
