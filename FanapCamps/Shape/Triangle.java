package FanapCamps.Shape;

public class Triangle extends Shape{
    public int height;
    public int base;
    //Constructor:
    public Triangle(int height, int base){
        this.base=base;
        this.height=height;
    }

    @Override
    public int area() {
        return (this.height*this.base)/2;
    }

    public void draw() {
        System.out.println("draw a triangle by pencil!");
    }
}
