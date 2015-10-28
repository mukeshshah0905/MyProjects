package com.designpattern.factorypattern;

public class FactoryPattern {
    public static void main(String[] args) {
        Shape rectangle=ShapFactory.getShape("rectangle");
        rectangle.draw();
        Shape circle=ShapFactory.getShape("circle");
        circle.draw();
    }
}

interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("inside Rectangle draw");
    }

}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("inside Circle draw");
    }
}

class ShapFactory {
    public static Shape getShape(String shapType) {
        if (shapType == null) {
            return null;
        } else if (shapType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        return null;

    }
}