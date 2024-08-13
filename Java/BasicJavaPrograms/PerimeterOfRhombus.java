import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
          Scanner sc =new Scanner(System.in);
        System.out.println("Perimeter of rhombus : ");

        System.out.print("Enter the side of the rhombus : ");
        double side=sc.nextDouble();
        

        double perimeter=RhombusPerimeter(side);

        System.out.println("Perimeter of rhombus with side "+side+" = "+perimeter+" cm");
    }
    public static double RhombusPerimeter(double side) {
        double perimeter=4*(side);

        return perimeter;

    }
}
