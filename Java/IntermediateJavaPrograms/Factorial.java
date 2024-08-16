package IntermediateJavaPrograms;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Find the factorial of a number : ");

        System.out.print("Enter a number to find its Factorial : ");
        int number=sc.nextInt();

        int factorial=Fact(number);

        System.out.println("The factorial of "+number+" is : "+factorial);
    }
    public static int Fact(int num) {
        int fact=1;
        for (int i = num; i > 0; i--) {
            fact*=i;
            
        }
        return fact;
    }
}
