package BasicJavaPrograms;

import java.util.*;

public class PerimeterParallelogram {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Perimeter of parallelogram : ");

        System.out.print("Enter the 1st sides of parallelogram : ");
        double side1=sc.nextDouble();
        System.out.print("Enter the 1st sides of parallelogram : ");
        double side2=sc.nextDouble();

        double perimeter=ParallelogramPerimeter(side1,side2);

        System.out.println("Perimeter of parallelogram with side 1 = "+side1+" and side 2 = "+side2+" = "+perimeter+" cm");
    }
    public static double ParallelogramPerimeter(double s1, double s2) {
        double perimeter=2*(s1+s2);

        return perimeter;
    }
}
