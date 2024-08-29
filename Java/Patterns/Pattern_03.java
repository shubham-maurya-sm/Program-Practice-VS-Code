/*
            * * * * * 
            * * * *   
            * * *
            * *
            *
 
*/

package Patterns;
import java.util.*;

public class Pattern_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int num=sc.nextInt();
        for (int row = num; row >0; row--) {
            for (int col = row; col >0 ; col--) {
        
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
