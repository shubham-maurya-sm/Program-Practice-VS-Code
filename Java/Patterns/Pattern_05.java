/*
        * 
        * *
        * * *
        * * * *
        * * * * *
        * * * *
        * * *
        * *
        *
*/

package Patterns;

import java.util.Scanner;

public class Pattern_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Odd number of Rows : ");
        int num = sc.nextInt();

        for (int row = 1; row <= (num + 1) / 2; row++) {
            for (int col = 1; col <= row; col++) {

                System.out.print("* ");

            }
            System.out.println();

        }

        for (int row = num / 2; row > 0; row--) {
            for (int col = 1; col <= row; col++) {

                System.out.print("* ");

            }
            System.out.println();

        }

    }
}
