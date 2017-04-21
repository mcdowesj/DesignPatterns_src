package com.creational.builderPattern.product;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This is our Product.
 */

public class Sandwich {

    private static Logger log = Logger.getLogger(Sandwich.class.getName());
    public BreadType breadType;
    public boolean isToasted;
    public CheeseType cheeseType;
    public MeatType meatType;
    public boolean hasMustard;
    public boolean hasMayo;
    public List<String> vegetables;

    public void display(){
        String nl = "\n";
        StringBuilder message = new StringBuilder("Sandwich on " + breadType + " bread \n");
        if(isToasted){
           message.append("Toasted \n");
        }
        if(hasMayo){
            message.append("Has mayo \n");
        }
        if(hasMustard){
            message.append("Has mustard \n");
        }
        message.append("Veggies: \n");
        for(String veg : vegetables){
            message.append(" - ").append(veg).append("\n");
        }

        log.log(Level.INFO, message.toString());
    }

    public enum MeatType{
        Turkey,
        Ham,
        Chicken,
        Salami
    }

    public enum CheeseType {
        American,
        Swiss,
        Cheddar,
        Provolone
    }

    public enum BreadType{
        White,
        Wheat
    }
}
