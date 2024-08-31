/*
Defanging an IP Address

A defanged IP address replaces every period "." with "[.]".

 

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"

*/



package StringsQuestions;

import java.util.Scanner;

public class DefangingIPaddress {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter an IP v4 Address in form of 255.100.50.0 : ");
        String ip=sc.nextLine();

        String changedIp=DefangedIp(ip);
        System.out.println();
        System.out.println("Original IP : "+ip);
        System.out.println("Defanged IP : "+changedIp);
    }
    public static String DefangedIp(String str)  {
        String ip=str.replace(".", "[.]");
        return ip;
    }
}
