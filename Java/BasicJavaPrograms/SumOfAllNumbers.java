import java.util.*;
public class SumOfAllNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);       
        
        System.out.println("Take integer inputs till the user enters 0 and print the sum of all numbers : ");
        int sum=0,number;
        System.out.println("Enter Your Until You press 0 for exit : ");
        while(true) {
            number=sc.nextInt();
            if(number!=0)
                sum+=number;
            else
                break;
        }
        System.out.println();

        System.out.println("The sum of all elements is : "+sum);
    }
}
