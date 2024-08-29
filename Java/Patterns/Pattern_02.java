/*
            * 
            * *
            * * *
            * * * *
            * * * * *
*/


package Patterns;

import java.util.*;
public class Pattern_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int num=sc.nextInt();
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
