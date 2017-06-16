package com.structural.compositePattern.gameExample.composite;

import com.structural.compositePattern.gameExample.component.Party;

import java.util.ArrayList;
import java.util.List;

public class Group implements Party {

    public String name;
    public Party[] members;
    private int totalGold;


    public Group(Party[] members) {
        this.members = members;
    }

    public Group(String name, Party[] members) {
        this.name = name;
        this.members = members;
    }

    @Override
    public int getGold() {
        for(Party member:members){
            totalGold += member.getGold();
        }
        return totalGold;
    }

    @Override
    public void setGold(int gold) {
        int evenSplitPerMember = gold/members.length;
        int leftOver = gold%members.length;
        for(Party member : members){
            int membersExistingGold = member.getGold();
            member.setGold(membersExistingGold += evenSplitPerMember + leftOver);
            leftOver = 0; //First member gets any remaining
        }
    }

    @Override
    public String getStats() {
        StringBuilder memberStats = new StringBuilder();
        for(Party member : members){
            memberStats.append(member.getStats());
        }

        return memberStats.toString();
    }
}
