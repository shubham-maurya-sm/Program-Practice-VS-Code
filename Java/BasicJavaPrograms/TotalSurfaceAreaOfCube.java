import java.util.*;
public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Total Surface Area of a cube :");

        System.out.print("Enter the length of edge of cube : ");
        double side=sc.nextDouble();
        

        double TSA=TotalSurfaceAreaCube(side);

        System.out.println("Total Surface Area of the cube with length of edge of cube = "+side+"cm  = "+TSA+" cm^3");
    }
    public static double TotalSurfaceAreaCube(double side) {
        double volume=6*side*side;

        return volume;
    }
}
