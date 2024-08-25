package FanapCamps.Shape;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }


    @Override
    public double calculatePerimeter() {
        return (this.length + this.width) * 2;
    }

    @Override
    public double calculateArea() {
        return this.length * this.width;
    }
}
