package builderPattern;

import builderPattern.Item.burger.ChickenBurger;
import builderPattern.Item.burger.VegBurger;
import builderPattern.Item.coldDrink.Coke;
import builderPattern.Item.coldDrink.Pepsi;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
