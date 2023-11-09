package CoffeeMachine.BaseCoffee;

import CoffeeMachine.Enums.CoffeeSize;

public class BlackCoffee implements Coffee{
    CoffeeSize coffeeSize;
    @Override
    public int getCost(){
        if(coffeeSize == CoffeeSize.SMALL) return 8;
        else if(coffeeSize == CoffeeSize.MEDIUM) return 10;
        else return 12;
    }
}
