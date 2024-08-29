/*
        1 
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
*/

package Patterns;
import java.util.*;

public class Pattern_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int num=sc.nextInt();
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
        
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
