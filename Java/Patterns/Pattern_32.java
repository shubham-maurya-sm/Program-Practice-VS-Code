/*
       E
       D E
       C D E
       B C D E
       A B C D E

*/

package Patterns;

import java.util.Scanner;

public class Pattern_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        for (int row = 1; row <= n; row++) {
            int alpha=65+n-row;
            for (int col = row; col > 0; col--) {

                    System.out.print((char)alpha+" ");
                    alpha++;

            }
            System.out.println();
        }

    }
}
