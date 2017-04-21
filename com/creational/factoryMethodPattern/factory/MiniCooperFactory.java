package com.creational.factoryMethodPattern.factory;

import com.creational.factoryMethodPattern.autos.Automobile;
import com.creational.factoryMethodPattern.autos.mini.MiniCooper;

public class MiniCooperFactory implements AutoFactory {
    @Override
    public Automobile createSportsCar() {
        MiniCooper mini = new MiniCooper();
        mini.addSportPackage();
        return mini;
    }

    @Override
    public Automobile createLuxuryCar() {
        MiniCooper mini = new MiniCooper();
        mini.addLuxuryPackage();
        return mini;
    }

    @Override
    public Automobile createEconomyCar() {
        return new MiniCooper();
    }
}
