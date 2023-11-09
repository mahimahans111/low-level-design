package CoffeeMachine.DecoratedCoffee.DecoratedCoffee;

import CoffeeMachine.BaseCoffee.Coffee;

public class ChocolateChipCoffee implements DecoratedCoffee {
    Coffee coffee;
    public ChocolateChipCoffee(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public int getCost(){
        return coffee.getCost()+5;
    }
}
