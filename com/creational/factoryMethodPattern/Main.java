package com.creational.factoryMethodPattern;

import com.creational.factoryMethodPattern.autos.Automobile;
import com.creational.factoryMethodPattern.factory.AutoFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * The Factory Method Pattern is a great way to remove ugly if/else/switch statements that would otherwise decide which
 * concrete class to create. It eliminates references to concrete classes and the instantiation logic.
 * The factories themselves can be inherited to provide an even more specialized object creation.
 *
 * Where the pattern falls down is we may need to crete a factory just to get a concrete class delivered to us.  The
 * inheritance hierarchy gets deeper with greater coupling between factories and the created classes.
 */
public class Main {
    public static void main(String ... args){

        AutoFactory factory = loadFactory();

        Automobile sportsCar = factory.createSportsCar();
        sportsCar.turnOn();
        sportsCar.turnOff();

        Automobile luxuryCar = factory.createLuxuryCar();
        luxuryCar.turnOn();
        luxuryCar.turnOff();

        Automobile economyCar = factory.createEconomyCar();
        economyCar.turnOn();
        economyCar.turnOff();

    }

    /**
     * This is absolutely not the best approach to this, but it shows some external configuration can be used to control
     * what we instantiate.
     */
    private static AutoFactory loadFactory(){
       Properties prop = new Properties();
       AutoFactory factory = null;
        try(InputStream is = new FileInputStream("src/com/creational/factoryMethodPattern/factorySettings.properties")){
            prop.load(is);
            //I'm sorry for this...
            factory = (AutoFactory)Class.forName(prop.getProperty("factoryPath")).newInstance();
        } catch (FileNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return factory;
    }
}
