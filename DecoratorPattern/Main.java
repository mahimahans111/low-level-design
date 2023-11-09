package DecoratorPattern;

import DecoratorPattern.BasePizzas.BasePizza;
import DecoratorPattern.BasePizzas.Margherita;
import DecoratorPattern.DecoratedPizzas.ExtraCheese;
import DecoratorPattern.DecoratedPizzas.Mushroom;

public class Main {
    public static void main(String args[]){
        //let's say we want a margherita pizza with extra cheese
        BasePizza marPizza = new Margherita();
        BasePizza marPizzaWithExtraCheese = new ExtraCheese(marPizza);
        System.out.println(marPizzaWithExtraCheese.cost());
        //now if marPizza, with extracheese & mushroom
        BasePizza marPizzaWithExtraCheeseAndMushroom = new Mushroom(marPizzaWithExtraCheese);
        //BasePizza marPizzaWithExtraCheeseAndMushroom = new Mushroom(ExtraCheese(Margherita()))
        System.out.println(marPizzaWithExtraCheeseAndMushroom.cost());

    }
}
