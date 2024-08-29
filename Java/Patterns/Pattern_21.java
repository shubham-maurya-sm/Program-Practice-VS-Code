/*
       1
       2  3
       4  5  6
       7  8  9  10
       11 12 13 14 15
*/


package Patterns;

import java.util.Scanner;

public class Pattern_21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No of Rows : ");
        int num=sc.nextInt();

        int temp=1;

        for (int row = 1; row <=num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(temp+"    ");
                temp++;
            }
            System.out.println();
        }
    }
}
