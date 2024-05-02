package org.howard.edu.lsp.oopfinal.question3;

public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Create a Circle using the factory and draw it
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        // Create a Rectangle using the factory and draw it
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
    }
}
