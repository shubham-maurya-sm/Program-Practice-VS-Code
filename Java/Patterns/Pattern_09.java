/*
            * * * * * 
             * * * *  
              * * *   
               * *    
                *
*/


package Patterns;

import java.util.Scanner;

public class Pattern_09 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

       System.out.print("Enter Number of Rows : ");
       int num=sc.nextInt();

       for (int row = num; row >=0; row--) {
        for (int col = num; col > 0; col--) {
            if(row>=col)
            System.out.print("* ");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}