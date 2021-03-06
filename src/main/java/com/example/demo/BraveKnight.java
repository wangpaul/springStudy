package com.example.demo;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/6/25 10:39
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
