/*
        a 
        B c
        D e F
        g H i J 
        k L m N o
*/



package Patterns;

import java.util.Scanner;

public class Pattern_33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n=sc.nextInt();
        int alpha=65;
        for (int row = 1; row <= n; row++){
            
            for (int col = row; col > 0; col--) {
                
                    if (alpha%2==0) {
                        System.out.print((char) alpha+" ");
                    }
                   
                else{
                    int ch=alpha+32;
                    System.out.print((char) ch+" ");
                }
                
                alpha++;
            }
            System.out.println();
        }
    }
}
