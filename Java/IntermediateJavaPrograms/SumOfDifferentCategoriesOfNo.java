package IntermediateJavaPrograms;

import java.util.Scanner;

public class SumOfDifferentCategoriesOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) : ");
        int negValue = 0, number, posEven = 0, posOdd = 0;
        System.out.println("Enter Your Numbers Until You press 0 for exit : ");
        while (true) {
            number = sc.nextInt();
            if (number != 0) {
                if (number < 0)
                    negValue = negValue + number;
                else if (number > 0 && number % 2 == 0)
                    posEven = posEven + number;
                else if (number > 0 && number % 2 != 0)
                    posOdd = posOdd + number;
                }
            else
                break;
        }
        System.out.println();

        System.out.println("The sum of all negative numbers are :  " + negValue);
        System.out.println("The sum of all positive Even numbers are :  " + posEven);
        System.out.println("The sum of all positive Odd numbers are :  " + posOdd);

    }
}
