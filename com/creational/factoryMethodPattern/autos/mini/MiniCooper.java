package com.creational.factoryMethodPattern.autos.mini;

import com.creational.factoryMethodPattern.autos.Automobile;
import com.sun.javafx.Logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MiniCooper implements Automobile {

    private static Logger log = Logger.getLogger(MiniCooper.class.getName());
    private String name;

    public MiniCooper(){
        name = "MiniCooper";
    }

    public void addSportPackage(){
        name += " S";
    }

    public void addLuxuryPackage(){
        name += " with leather upholstery";
    }

    @Override
    public void turnOn() {
        log.info("The "+ name + " is on and running...it's a mini...");
    }

    @Override
    public void turnOff() {
        log.info("The Mini Cooper is now off.");
    }
}
