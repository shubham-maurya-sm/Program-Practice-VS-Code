/*
        E D C B A
        D C B A
        C B A
        B A
        A
*/


package Patterns;

import java.util.Scanner;

public class Pattern_34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int num=sc.nextInt();
        int counter=0;
        for (int row = num; row >0 ; row--) {
            int alpha=65+num-1+counter;
            for (int col = 1; col <=row; col++) {
                System.out.print((char) alpha+" ");
                alpha--;
            }
            counter--;
            
            System.out.println();
        }
    }
}
