package com.structural.compositePattern.gameExample.leaf;

import com.structural.compositePattern.gameExample.component.Party;

public class Person implements Party{
    public String name;
    private int myGold;

    public Person(String name, int myGold) {
        this.name = name;
        this.myGold = myGold;
    }

    @Override
    public int getGold() {
        return this.myGold;
    }

    @Override
    public void setGold(int gold) {
        this.myGold = gold;
    }

    @Override
    public String getStats() {
        return "\n" + this.name + " has " + this.myGold;
    }
}
