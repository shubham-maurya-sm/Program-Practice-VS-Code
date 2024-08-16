package IntermediateJavaPrograms;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Find Sum Of A Digits Of Number : ");

        System.out.print("Enter a number to find its sum of digits : ");
        int number=sc.nextInt();

        int sumDigit=DigitsSum(number);

        System.out.println("The sum of digits of "+number+" is : "+sumDigit);
    }
    public static int DigitsSum(int num) {
        int rem,sum=0;
            while (num>0) {
                rem=num%10;
                sum+=rem;
                num/=10;
            }

        return sum;
    }
}
