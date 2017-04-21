package com.creational.builderPattern.concreteBuilder;

import com.creational.builderPattern.builder.SandwichBuilder;
import com.creational.builderPattern.product.Sandwich;

import java.util.Arrays;

/**
 * This is one of our Concrete Builders
 */
public class ClubSandwichBuilder extends SandwichBuilder {
    @Override
    public void prepareBread() {
        sandwich.breadType = Sandwich.BreadType.White;
        sandwich.isToasted = true;
    }

    @Override
    public void applyMeatAndCheese() {
        sandwich.cheeseType = Sandwich.CheeseType.Swiss;
        sandwich.meatType = Sandwich.MeatType.Turkey;
    }

    @Override
    public void applyVegetables() {
        sandwich.vegetables = Arrays.asList("Tomato", "Onion", "Lettuce");
    }

    @Override
    public void addCondiments() {
        sandwich.hasMayo = true;
        sandwich.hasMustard = true;
    }
}
