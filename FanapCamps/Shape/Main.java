package FanapCamps.Shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //دریافت ارتفاع و قاعده مثلث از کاربر
        java.util.Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Height And Base of Your Triangle: ");

        int height = input.nextInt();
        int base = input.nextInt();
        System.out.println("The Height of Triangle is: " + height + " and The Base of its is: " + base);
        input.close();

        Triangle triangle= new Triangle(height, base);
        System.out.println("The Area of Your Triangle is: " + triangle.area());

        //Practice5-5:
        triangle.draw();

    }
}
