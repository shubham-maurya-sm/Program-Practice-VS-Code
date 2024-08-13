package BasicJavaPrograms;

import java.util.*;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Program : Area of Equilateral Triangle : ");
        System.out.println("Enter the side of the triangle : ");
        double side =sc.nextDouble();
         double area=Area(side);

         System.out.println("Area of Equilateral triangle with side = "+side+ " = "+area);
    }
    public static Double Area(double side){
        double area=(Math.sqrt(3)*side*side)/4;

        return area;
    }
}
