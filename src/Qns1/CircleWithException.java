package Qns1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleWithException {
    private double radius;

    public CircleWithException(double radius) {
        if (isValidRadius(radius)) {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (isValidRadius(radius)){
            this.radius = radius;
        }
    }

    public double getDiameter() {
        return 2*this.radius;
    }

    public double getArea() {
        double area = 0;
        try {
            area = Math.PI*Math.pow(this.radius, 2);
            if (area > 1000) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Area is more than 1000!");
            System.exit(-1);
        }
        return area;
    }

    public boolean isValidRadius(double radius) {
        try{
            if (radius < 0) {
                throw new IllegalArgumentException("Radius cannot be smaller than 0!");
            }
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(-1);
        }
        return false;
    }

    public static void main(String[] args) {
        CircleWithException circle = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        try {
            circle = new CircleWithException(sc.nextDouble());
        } catch (InputMismatchException e) {
            System.out.println("Radius must be a numeric value!");
            System.exit(-1);
        }
        System.out.format("Radius of the circle is %f\n", circle.getRadius());
        System.out.format("Area of the circle is %f\n", circle.getArea());
        System.out.format("Diameter of the circle is %f\n", circle.getDiameter());
    }
}
