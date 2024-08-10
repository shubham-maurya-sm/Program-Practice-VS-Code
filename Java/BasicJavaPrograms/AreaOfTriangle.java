package BasicJavaPrograms;

import java.util.*;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the base of the triangle)");
        double base=sc.nextDouble();
        System.out.println("Enter the height of the triangle)");
        double height=sc.nextDouble();

        double area=TriangleArea(base,height);
        System.out.println("Area of triangle with base= "+base+" and height= "+height+" is = "+area);

    }
    public static Double TriangleArea(double b, double h){
        double area=(b*h)/2;
        
        return area;
    }
}
