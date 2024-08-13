package BasicJavaPrograms;

import java.util.*;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter '1' for finding area Using Base and Height ");
        System.out.println("Enter '2' for finding area Using Trigonometry (i.e., using side and angle)");
        System.out.println("Enter '3' for finding area Using diagonals ");
        System.out.println("Enter Your Option: ");
        int option = sc.nextInt();
        double area;
        switch (option) {
            case 1:
                System.out.print("Enter the base i.e, length of any side of the Rhombus : ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the Rhombus : ");
                double height = sc.nextDouble();

                area = RhombusAreaHeight(base, height);
                System.out.println("Results :");
                System.out.println(
                        "Area of Rhombus With Height where base= " + base + " and height= " + height + " is = " + area);

                break;

            case 2:
                System.out.print("Enter the length of any side of the Rhombus : ");
                double bse = sc.nextDouble();

                System.out.print("Enter any angle between the sides of the Rhombus : ");
                double angle1 = sc.nextDouble();

                area = RhombusAreaSide(bse, angle1);
                System.out.println("Results :");
                System.out.println(
                        "Area of Rhombus With side where base = " + bse + " is = " + area);

                break;

            case 3:
                System.out.print("Enter the length of 1st diagonal of the Rhombus : ");
                double diagonal1 = sc.nextDouble();
                System.out.print("Enter the length of 2nd diagonal of the Rhombus : ");
                double diagonal2 = sc.nextDouble();

                area = RhombusAreaDiagonal(diagonal1, diagonal2);
                System.out.println("Results :");
                System.out.println(
                        "Area of Rhombus with 1st diagonal= " + diagonal1 + " and 2nd diadonal= " + diagonal2 + " is = "
                                + area);

                break;

            default:
                System.out.println("Entered  wrong choice !! Thank You !");
                break;
        }

    }

    public static Double RhombusAreaHeight(double b, double h) {
        double area = b * h;

        return area;
    }

    public static Double RhombusAreaDiagonal(double diag1, double diag2) {
        double area = (diag1 * diag2) / 2;

        return area;
    }

    public static Double RhombusAreaSide(double b, double angle) {
        double area = (b * b * Math.sin(angle * Math.PI / 180));

        return area;
    }
}
