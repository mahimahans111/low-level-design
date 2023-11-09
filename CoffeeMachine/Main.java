package CoffeeMachine;

import CoffeeMachine.BaseCoffee.BlackCoffee;
import CoffeeMachine.DecoratedCoffee.DecoratedCoffee.DecoratedCoffee;
import CoffeeMachine.DecoratedCoffee.DecoratedCoffee.SugarCoffee;

public class Main {

    public static void main(String args[]){
        DecoratedCoffee blackCoffeeWithSugar = new SugarCoffee(new BlackCoffee());
        System.out.println(blackCoffeeWithSugar.getCost());

//        toppings-
//                base-
    }
}
