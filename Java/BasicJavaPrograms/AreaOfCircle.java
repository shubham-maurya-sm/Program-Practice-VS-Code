package BasicJavaPrograms;

import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Radius(in cm): ");
        double radius=sc.nextDouble();
        double area=CircleArea(radius);
        System.out.println("Area of the circle of radius "+radius+" is : "+area);

    }
    public static double CircleArea(double r){
        double area=Math.PI*r*r;
        return area;
    }
}
