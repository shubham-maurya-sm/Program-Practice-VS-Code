import java.util.*;
public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Total Surface Area of a cylinder :");

        System.out.print("Enter the radius of the cylinder : ");
        double radius=sc.nextDouble();
        System.out.print("Enter the height of the cylinder : ");
        double height=sc.nextDouble();

        double TSA=TotalSurfaceAreaCylinder(radius,height);

        System.out.println("Total Surface Area of the cylinder with radius = "+radius+"cm and height = "+height+"cm = "+TSA+" cm^3");
    }
    public static double TotalSurfaceAreaCylinder(double rad, double hgt) {
        double volume=2*(Math.PI*rad*hgt);

        return volume;
    }
}
