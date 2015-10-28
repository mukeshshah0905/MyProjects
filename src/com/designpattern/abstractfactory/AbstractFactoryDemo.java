package com.designpattern.abstractfactory;


public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory shapeAF=FactoryProvider.getAbstractFactory("shape");
        Shape sh=shapeAF.getShape("Rectangle");
        sh.draw();
        Shape sh1=shapeAF.getShape("Circle");
        sh1.draw();
        AbstractFactory colorAF=FactoryProvider.getAbstractFactory("color");
        Color cl=colorAF.getColor("Red");
        cl.fill();
        Color cl1=colorAF.getColor("blue");
        cl1.fill();
    }
}

interface Shape {
    void draw();
}

interface Color {
    void fill();
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

class Red implements Color {

    @Override
    public void fill() {
        System.out.println("inside Red fill");
    }

}

class Blue implements Color {
    
    @Override
    public void fill() {
        System.out.println("inside Blue fill");
    }
}

abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);

    abstract Color getColor(String colorType);

}
class ShapeFactory extends AbstractFactory{

    @Override
    Shape getShape(String shapeType) {
        if(shapeType==null){
        return null;
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        return null;
    }

    @Override
    Color getColor(String colorType) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
class ColorFactory extends AbstractFactory{

    @Override
    Shape getShape(String shapeType) {
        return null;
    }

    @Override
    Color getColor(String colorType) {
        if(colorType==null){
            return null;
            }else if(colorType.equalsIgnoreCase("RED")){
                return new Red();
            }else if(colorType.equalsIgnoreCase("BLUE")){
                return new Blue();
            }
            return null;
    }
    
}
class FactoryProvider {
    public static AbstractFactory getAbstractFactory(String choice){
        if(choice.equalsIgnoreCase("Shape")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("Color")){
            return new ColorFactory();
        }
        return null;
    }
}