import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Volume of a cylinder :");

        System.out.print("Enter the radius of the cylinder : ");
        double radius=sc.nextDouble();
        System.out.print("Enter the height of the cylinder : ");
        double height=sc.nextDouble();

        double volume=VolumeCylinder(radius,height);

        System.out.println("Volume of the cylinder with radius = "+radius+"cm and height = "+height+"cm = "+volume+" cm^3");
    }
    public static double VolumeCylinder(double rad, double hgt) {
        double volume=(Math.PI*rad*rad*hgt);

        return volume;
    }
}
