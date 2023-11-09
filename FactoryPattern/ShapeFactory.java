package FactoryPattern;

public class ShapeFactory {
    Shape getShape(String input){
        switch(input){
            case "CIRCLE":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
