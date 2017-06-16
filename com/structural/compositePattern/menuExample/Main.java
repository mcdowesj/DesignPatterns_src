package com.structural.compositePattern.menuExample;

import com.structural.compositePattern.menuExample.composite.Menu;
import com.structural.compositePattern.menuExample.leaf.MenuItem;

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
 */
public class Main {
    public static void main(String[] args){
        Logger logger = Logger.getLogger(Main.class.getName());

        Menu mainMenu = new Menu("Main", "/main");

        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");

        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("Claims", "/claims");

        mainMenu.add(claimsSubMenu);

        MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");

        claimsSubMenu.add(personalClaimsMenu);

        logger.info(mainMenu.toString());
    }
}
