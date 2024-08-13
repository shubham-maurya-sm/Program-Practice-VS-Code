package BasicJavaPrograms;

import java.util.*;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        double length=sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle");
        double breadth=sc.nextDouble();

        double area=RectangleArea(length,breadth);
        System.out.println("Area of rectangle with length= "+length+" and breadth= "+breadth+" is = "+area);

    }
    public static Double RectangleArea(double l, double b){
        double area=l*b;
        
        return area;
    }
}
