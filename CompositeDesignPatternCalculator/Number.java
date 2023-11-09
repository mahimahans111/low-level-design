package CompositeDesignPatternCalculator;
//number is always leaf node
public class Number implements ArithmeticExpression{
    int value;
    public Number(int val){
        this.value = val;
    }

    public int evaluate(){
        System.out.println("Number value is "+ value);
        return value;
    }
}
