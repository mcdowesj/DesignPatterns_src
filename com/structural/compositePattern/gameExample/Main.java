package com.structural.compositePattern.gameExample;

import com.structural.compositePattern.gameExample.component.Party;
import com.structural.compositePattern.gameExample.composite.Group;
import com.structural.compositePattern.gameExample.leaf.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual
 * objects and compositions of objects uniformly.
 *
 *                    Component -0..*
 *                    operation()
 *                        |
 *                ------------------
 *                |                |
 *              Leaf            Composite -1
 *           operation()        operation()
 *                                 add()
 *                               remove()
 *                               getChild()
 *
 *
 * In this example we need to be able to treat a Person and Group as the same thing. A Group could be multiple people,
 * multiple groups, or a combination (see devs and parties). Then we can call the getStats method on a party and get
 * the stats of everyone in the party.
 *
 */

public class Main {
    public static void main(String[] args){
        Logger logger = Logger.getLogger(Main.class.getName());

        int goldForKill = 1023;
        logger.info("You have killed the beast and gained " + goldForKill + " gold!");

        Party joe = new Person("Joe", 0);
        Party jake = new Person("Jake", 0);
        Party emily = new Person("Emily", 0);
        Party sophia = new Person("Sophia", 0);
        Party brian = new Person("Brian", 0);
        Party oldBob = new Person("Old Bob", 0);
        Party newBob = new Person("New Bob", 0);

        Party bobs = new Group(new Party[]{oldBob, newBob});
        Party devs = new Group("Developers" , new Party[]{joe, jake, emily, bobs} );

        Party parties = new Group(new Party[]{devs, sophia, brian});

        parties.setGold(goldForKill);
        logger.info(parties.getStats());

        /*
         This is just an example of looping through each party ourselves and summing their gold to make sure we get the
         correct result.
         */
        Group test = new Group(new Party[]{parties});
        int totalGold = 0;
        for(Party party : test.members){
            totalGold += party.getGold();
        }
        logger.info("The original amount was " + goldForKill + ".\nWhen we add the gold of each member of the group " +
                "we get "+ totalGold+ ".\nAre they the same? " + (goldForKill == totalGold));

    }
}
