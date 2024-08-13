package BasicJavaPrograms;

import java.util.*;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter '1' for finding area Using Base and Height ");
        System.out.println("Enter '2' for finding area Using Trigonometry ");
        System.out.println("Enter '3' for finding area Using diagonals ");
        System.out.println("Enter Your Option: ");
        int option = sc.nextInt();
        double area;
        switch (option) {
            case 1:
                System.out.print("Enter the base of the parallelogram : ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the parallelogram : ");
                double height = sc.nextDouble();

                area = ParallelogramAreaHeight(base, height);
                System.out.println("Results :");
                System.out.println("Area of Parallelogram With Height where base= " + base + " and height= " + height + " is = " + area);

                break;

            case 2:
                System.out.print("Enter the base of the parallelogram : ");
                double bse = sc.nextDouble();
                System.out.print("Enter the side of the parallelogram : ");
                double side = sc.nextDouble();
                System.out.print("Enter any angle between the sides of the parallelogram : ");
                double angle1 = sc.nextDouble();

                area = ParallelogramAreaSide(bse, side, angle1);
                System.out.println("Results :");
                System.out.println(
                        "Area of Parallelogram With side where base = " + bse + " and side = " + side + " is = " + area);

                break;

            case 3:
                System.out.print("Enter the 1st diagonal of the parallelogram : ");
                double diagonal1 = sc.nextDouble();
                System.out.print("Enter the 2nd diagonal of the parallelogram : ");
                double diagonal2 = sc.nextDouble();
                System.out.print("Enter angle between at the intersection point of the diagonals : ");
                double angle = sc.nextDouble();

                area = ParallelogramAreaDiagonal(diagonal1, diagonal2, angle);
                System.out.println("Results :");
                System.out.println(
                        "Area of parallelogram with 1st diagonal= " + diagonal1 + " and 2nd diadonal= " + diagonal2 + " is = " + area);

                break;

            default: System.out.println("Entered  wrong choice !! Thank You !");
                break;
        }

    }

    public static Double ParallelogramAreaHeight(double b, double h) {
        double area = b * h;

        return area;
    }

    public static Double ParallelogramAreaDiagonal(double diag1, double diag2, double angle) {
        double area = (diag1 * diag2 * Math.sin(angle * Math.PI / 180)) / 2;

        return area;
    }

    public static Double ParallelogramAreaSide(double b, double s, double angle) {
        double area = (b * s * Math.sin(angle * Math.PI / 180));

        return area;
    }
}
