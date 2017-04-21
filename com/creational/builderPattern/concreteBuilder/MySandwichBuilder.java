package com.creational.builderPattern.concreteBuilder;

import com.creational.builderPattern.builder.SandwichBuilder;
import com.creational.builderPattern.product.Sandwich;

import java.util.Arrays;

/**
 * This is one of our Concrete Builders
 */
public class MySandwichBuilder extends SandwichBuilder {

    @Override
    public void prepareBread() {
       sandwich.breadType = Sandwich.BreadType.White;
       sandwich.isToasted = true;
    }

    @Override
    public void applyMeatAndCheese() {
        sandwich.meatType = Sandwich.MeatType.Turkey;
        sandwich.cheeseType = Sandwich.CheeseType.Cheddar;
    }

    @Override
    public void applyVegetables() {
        sandwich.vegetables = Arrays.asList("Tomato", "Onion");
    }

    @Override
    public void addCondiments() {
        sandwich.hasMayo = false;
        sandwich.hasMustard = false;
    }
}
