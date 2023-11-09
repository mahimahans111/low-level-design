package DecoratorPattern.DecoratedPizzas;

import DecoratorPattern.BasePizzas.BasePizza;

public class ExtraCheese extends ToppingDecorator{
    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
