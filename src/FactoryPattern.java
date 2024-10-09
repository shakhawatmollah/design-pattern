
/**
 * Factory Pattern (Creational Patterns)
 * Defines an interface for creating an object, but lets subclasses decide which class to instantiate.
 * Defines an interface for creating an object but allows subclasses to alter the type of objects that will be created.
 */


interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

class ShapeFactory {
    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}

public class FactoryPattern {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape square = ShapeFactory.getShape("SQUARE");
        square.draw();
    }
}
