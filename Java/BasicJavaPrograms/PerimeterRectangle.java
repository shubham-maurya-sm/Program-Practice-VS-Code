import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Perimeter of Rectangle : ");

        System.out.print("Enter the length of the rectangle : ");
        double length=sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle : ");
        double breadth=sc.nextDouble();

        double perimeter=RectanglePerimeter(length,breadth);

        System.out.println("Perimeter of rectangle with length = "+length+" and breadth = "+breadth+" = "+perimeter+" cm");
    }
    public static double RectanglePerimeter(double len, double bre) {
        double perimeter=2*(len+bre);

        return perimeter;
    }
}
