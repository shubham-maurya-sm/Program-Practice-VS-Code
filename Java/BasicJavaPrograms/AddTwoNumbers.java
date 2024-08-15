import java.util.*;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Addition Of Two Numbers: ");

        System.out.print("Enter 1st Number : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter 2nd Number : ");
        double num2 = sc.nextDouble();

        System.out.println("The addition of two numbers i.e., " + num1 + " + " + num2 + " = " + Addition(num1, num2));
    }

    public static double Addition(double num1, double num2) {
        return num1 + num2;
    }
}
