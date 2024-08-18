package IntermediateJavaPrograms;

import java.util.Scanner;

public class GoOutOnEvenDaysOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month name when He goes out on Even Days : ");
        String month = sc.nextLine();
        month = month.trim();
        month = month.toLowerCase();
        int monthDays, roamOut = 0;

        switch (month) {
            case "january":
                monthDays = 31;
                roamOut = monthDays / 2;
                break;
            case "february":
                monthDays = 28;
                roamOut = monthDays / 2;
                break;
            case "march":
                monthDays = 31;
                roamOut = monthDays / 2;
                break;
            case "april":
                monthDays = 30;
                roamOut = monthDays / 2;
                break;
            case "may":
                monthDays = 31;
                roamOut = monthDays / 2;
                break;
            case "june":
                monthDays = 30;
                roamOut = monthDays / 2;
                break;
            case "july":
                monthDays = 31;
                roamOut = monthDays / 2;
                break;
            case "august":
                monthDays = 31;
                roamOut = monthDays / 2;
                break;
            case "september":
                monthDays = 30;
                roamOut = monthDays / 2;
                break;
            case "october":
                monthDays = 31;
                roamOut = monthDays / 2;
                break;
            case "november":
                monthDays = 30;
                roamOut = monthDays / 2;
                break;
            case "december":
                monthDays = 31;
                roamOut = monthDays / 2;
                break;

            default:
                System.out.println("Please ! enter month name correctly !!");

                break;
        }
        if (roamOut != 0)
            System.out.println("Kunal is allowed to go out with his friends " + roamOut + "  days in "+ month.toUpperCase() + " month");

    }
}
