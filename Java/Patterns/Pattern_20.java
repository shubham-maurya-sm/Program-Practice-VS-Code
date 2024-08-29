/*
        ****
        *  *
        *  *
        *  *
        ****
*/


package Patterns;

import java.util.Scanner;

public class Pattern_20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No of rows : ");
        int num=sc.nextInt();

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                if(row==1 || row==num || col==1 || col==num)
                System.out.print("* ");
                else if (col>1 && col<num) {
                    System.out.print("  ");
                }
                
                
                
            }
            System.out.println();
        }
    }
}
