package IntermediateJavaPrograms;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("To Check whether year is Leap Year Or Not : ");

        System.out.print("Enter a number to find its Factorial : ");
        int year = sc.nextInt();

        boolean leap = checkLeap(year);

        if (leap)
            System.out.println("The year " + year + " is  a Leap Year");
        else
            System.out.println("The year " + year + " is NOT a Leap Year");
    }

    public static boolean checkLeap(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) )
            return true;
        else
            return false;
    }
}
