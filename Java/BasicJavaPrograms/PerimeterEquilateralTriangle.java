package BasicJavaPrograms;

import java.util.Scanner;

public class PerimeterEquilateralTriangle {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("Program : Perimeter of Equilateral Triangle : ");
        System.out.println("Enter the side of the triangle : ");
        double side =sc.nextDouble();
         double perimeter=PerimeterEquilateral(side);

         System.out.println("Perimeter of Equilateral triangle with side = "+side+ " = "+perimeter);
    }
    public static Double PerimeterEquilateral(double side){
        double perimeter=side+side+side;

        return perimeter;
    }
}
