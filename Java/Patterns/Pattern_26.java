/*
            1 1 1 1 1 1
            3 3 3 3
            4 4 4
            5 5
            6
*/

package Patterns;

import java.util.Scanner;

public class Pattern_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("===============================");
        int counter = 1;
        for (int row = n; row > 0; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(counter + " ");
            }
            counter++;
            System.out.println();
        }
    }
}
