package BasicJavaPrograms;

import java.util.*;

public class PerimeterCircle {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("Enter Radius(in cm): ");
        double radius=sc.nextDouble();
        double perimeter=CirclePerimeter(radius);
        System.out.println("Perimeter of the circle of radius "+radius+" is : "+perimeter);

    }
    public static double CirclePerimeter(double r){
        double perimeter=2*Math.PI*r;
        return perimeter;
    }
}
