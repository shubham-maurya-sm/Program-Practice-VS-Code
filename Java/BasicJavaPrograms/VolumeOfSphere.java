import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Volume of a sphere :");

        System.out.print("Enter the radius of the sphere : ");
        double radius=sc.nextDouble();
      

        double volume=VolumeSphere(radius);

        System.out.println("Volume of the sphere with radius = "+radius+" cm = "+volume+" cm^3");
    }
    public static double VolumeSphere(double rad) {
        double volume=(Math.PI*rad*rad*rad)*4/3;

        return volume;
    }
}
