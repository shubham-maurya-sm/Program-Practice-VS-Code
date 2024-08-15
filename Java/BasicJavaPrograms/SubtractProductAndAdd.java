import java.util.*;
public class SubtractProductAndAdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Subtract the Product and Sum of Digits of an Integer : ");

        System.out.print("Enter 1st Number : ");
        double num1=sc.nextDouble();
        System.out.print("Enter 2nd Number : ");
        double num2=sc.nextDouble();

        double prod=Product(num1,num2);
// System.out.println(prod);
        double add=Addition(num1,num2);
// System.out.println(add);
        double sub=Subtract(prod,add);

        System.out.println("The Subtraction of the Product and Sum of Digits of an Integer with num1 = "+num1+" and num2 = "+num2+" is = "+sub);

        
    }
    public static double Product(double num1, double num2) {
        return num1*num2;
    }
    public static double Addition(double num1, double num2) {
        return num1+num2;
    }
    public static double Subtract(double num1, double num2) {
        return num1-num2;
    }
}
