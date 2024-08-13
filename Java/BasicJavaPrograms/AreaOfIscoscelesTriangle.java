package BasicJavaPrograms;

import java.util.*;
public class AreaOfIscoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the side of the triangle");
        double side=sc.nextDouble();
        System.out.println("Enter the base of the triangle");
        double base=sc.nextDouble();

        double area=IsoscelesTriangleArea(side,base);
        System.out.println("Area of triangle with side= "+side+" and base= "+base+" is = "+area);

    }
    public static Double IsoscelesTriangleArea(double s, double b){
        double area=b*Math.sqrt(4*s*s-b*b)/4;
        
        return area;
    }
}
