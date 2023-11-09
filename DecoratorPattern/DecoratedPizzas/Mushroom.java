package DecoratorPattern.DecoratedPizzas;

import DecoratorPattern.BasePizzas.BasePizza;

public class Mushroom extends ToppingDecorator{
    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost(){
        return this.basePizza.cost()+20;
    }
}
