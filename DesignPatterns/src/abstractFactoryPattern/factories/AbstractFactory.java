package abstractFactoryPattern.factories;

import abstractFactoryPattern.interfaces.Color;
import abstractFactoryPattern.interfaces.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
