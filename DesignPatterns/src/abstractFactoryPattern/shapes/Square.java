package abstractFactoryPattern.shapes;

import abstractFactoryPattern.interfaces.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
