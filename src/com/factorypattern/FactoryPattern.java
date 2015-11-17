package com.factorypattern;

public class FactoryPattern {
    public static void main(String[] args) {
        Rectangle rectangle=(Rectangle) ShapFactory.getShap("rectangle");
        rectangle.draw();
        
        Circle circle=(Circle) ShapFactory.getShap("circle");
        circle.draw();
    }
}

interface Shap {
    void draw();
}

class Rectangle implements Shap {
    @Override
    public void draw() {
        System.out.println("draw in rectangle");
    }
}

class Circle implements Shap {
    @Override
    public void draw() {
        System.out.println("draw in circle");
    }
}

class ShapFactory {
    public static Shap getShap(String shapType){
        if(shapType==null){
            return null;
        }else if(shapType.equals("rectangle")){
            return new Rectangle();
        }else if(shapType.equals("circle")){
            return new Circle();
        }
           return null;
        }
}