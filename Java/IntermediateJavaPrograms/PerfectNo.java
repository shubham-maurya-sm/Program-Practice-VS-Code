/*
 A perfect number is a positive integer that equals the sum of its proper divisors (excluding the number itself). For example, 6 is a perfect number because the sum of its proper divisors (1, 2, and 3) is equal to 6: 1+2+3=6 

 Some well-known perfect numbers include 6, 28, 496, and 8128
 
*/

package IntermediateJavaPrograms;

import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to check whether it is Perfect No or Not : ");
        int num = sc.nextInt();

        boolean perfect = PerfectNum(num);
        if(perfect)
        System.out.println("The number "+num+" is a Perfect Number !!");
        else
        System.out.println("The number "+num+" is NOT a Perfect Number !!");
    }

    public static boolean PerfectNum(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum += i;

        }
        if (sum == num)
            return true;
        else
            return false;

    }
}
