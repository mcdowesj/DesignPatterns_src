package com.creational.builderPattern.director;

import com.creational.builderPattern.builder.SandwichBuilder;
import com.creational.builderPattern.product.Sandwich;

/**
 * This is our Director
 */
public class SandwichMaker {

    private SandwichBuilder builder;

    public SandwichMaker(SandwichBuilder builder){
        this.builder = builder;
    }

    public void buildSandwich(){
        builder.createNewSandwich();
        builder.prepareBread();
        builder.applyMeatAndCheese();
        builder.applyVegetables();
        builder.addCondiments();
    }

    public Sandwich getSandwich(){
        return builder.getSandwich();
    }
}
