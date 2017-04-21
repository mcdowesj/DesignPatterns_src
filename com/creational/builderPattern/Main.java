package com.creational.builderPattern;

import com.creational.builderPattern.concreteBuilder.ClubSandwichBuilder;
import com.creational.builderPattern.concreteBuilder.MySandwichBuilder;
import com.creational.builderPattern.director.SandwichMaker;
import com.creational.builderPattern.product.Sandwich;

/**
 * Overview of Builder
 *
 * Separates the construction of a complex object from its representation so that the same construction process can
 * create different representations.
 *
 * This pattern helps to solve 3 problems - Too many parameters (in a constructor, usually)
 *                                          Order dependent (this can lead on from problem 1
 *                                          Different constructions - same structure but different data representation
 *
 *    Director <--- Builder <---- Concrete
 *                                Builder
 *                                   |
 *                                   |
 *                                   |
 *                                  \/
 *                                Product
 *
 * Director - Uses the Concrete Builder
 *          - Knows how to build
 *          - Client code calls directly (...)
 *
 * Builder  - Abstract interface or class
 *          - Defines the steps
 *          - Holds instance of Product
 *
 * Concrete Builder - Should be more than one of these, otherwise what's the point?
 *                  - Provides an implementation for interface defined by the builder
 *                  - Analogous to a recipe.
 *
 * Product  - What is being built
 *          - Not a different type, but different data
 *
 */
public class Main {

    public static void main(String ... args){
        SandwichMaker sandwichMaker1 = new SandwichMaker(new MySandwichBuilder());
        sandwichMaker1.buildSandwich();
        Sandwich sandwich1 = sandwichMaker1.getSandwich();
        sandwich1.display();

        SandwichMaker sandwichMaker2 = new SandwichMaker(new ClubSandwichBuilder());
        sandwichMaker2.buildSandwich();
        Sandwich sandwich2 = sandwichMaker2.getSandwich();
        sandwich2.display();

    }
}
