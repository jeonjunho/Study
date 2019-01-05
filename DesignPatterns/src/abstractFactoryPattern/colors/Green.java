package abstractFactoryPattern.colors;

import abstractFactoryPattern.interfaces.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
