import java.util.*;
public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Volume of a cone :");

        System.out.print("Enter the radius of the cone : ");
        double radius=sc.nextDouble();
        System.out.print("Enter the height of the cone : ");
        double height=sc.nextDouble();

        double volume=VolumeCone(radius,height);

        System.out.println("Volume of the cone with radius ="+radius+" and height = "+height+" = "+volume+" cm^3");
    }
    public static double VolumeCone(double rad, double hgt) {
        double volume=(Math.PI*rad*rad*hgt)/3;

        return volume;
    }
}
