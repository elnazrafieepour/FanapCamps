package FanapCamps.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        Rectangle rectangle = new Rectangle(3, 5);
        Circle circle = new Circle(10);

        shapes.add(rectangle);
        shapes.add(circle);

        for(Shape shape: shapes) {
            System.out.println("Shape type: " + shape.getClass().getSimpleName());
            System.out.println("perimeter: " + shape.calculatePerimeter());
            System.out.println("area: " + shape.calculateArea());
        }

    }
}
