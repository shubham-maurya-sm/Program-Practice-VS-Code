/*
       1
       0 1
       1 0 1
       0 1 0 1
       1 0 1 0 1

*/package Patterns;

import java.util.Scanner;

public class Pattern_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Rows : ");
        int num = sc.nextInt();

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                if ((row % 2 != 0 && col % 2 != 0) || (row % 2 == 0 && col % 2 == 0))
                    System.out.print("1 ");
                else
                    System.out.print("0 ");

            }
            System.out.println();
        }
    }
}
