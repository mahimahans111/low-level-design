package CoffeeMachine.DecoratedCoffee.DecoratedCoffee;

import CoffeeMachine.BaseCoffee.Coffee;

public class SugarCoffee implements DecoratedCoffee{

    Coffee coffee;

    public SugarCoffee(Coffee coffee){
        this.coffee = coffee;
    }

    public int getCost(){
        return coffee.getCost()+2;
    }

}
