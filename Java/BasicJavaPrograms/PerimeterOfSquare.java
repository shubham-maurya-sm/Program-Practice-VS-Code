import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Perimeter of square : ");

        System.out.print("Enter the side of the square : ");
        double side=sc.nextDouble();
        

        double perimeter=SquarePerimeter(side);

        System.out.println("Perimeter of square with side "+side+" = "+perimeter+" cm");
    }
    public static double SquarePerimeter(double side) {
        double perimeter=4*(side);

        return perimeter;
    
    }
}
