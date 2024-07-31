package creational.factory;

public class ShapeFactory {
    public interface Shape {
        public void draw();
    }

    public static class Circle implements Shape {
        @Override
        public void draw() {
            System.out.println("Circle draw");
        }
    }

    public static class Rectangle implements Shape {
        @Override
        public void draw() {
            System.out.println("Rectangle draw");
        }
    }

    public static class Square implements Shape {
        @Override
        public void draw() {
            System.out.println("Square draw");
        }
    }

    public static Shape getShape(String shapeType) {
        if (shapeType == null)
            return null;
        if (shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        else if (shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        return null;
    }

    public static void main(String[] args) {
        Shape shape1 = getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = getShape("RECTANGLE");
        shape2.draw();
    }
}
