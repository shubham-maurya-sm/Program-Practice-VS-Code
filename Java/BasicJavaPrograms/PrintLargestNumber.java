import java.util.*;
public class PrintLargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);       
        
        System.out.println("Take integer inputs till the user enters 0 and print the largest number from all : ");
        int max=0,number;
        System.out.println("Enter Your Until You press 0 for exit : ");
        while(true) {
            number=sc.nextInt();
            if(number!=0)
                if(number>max)
                    max=number;
                else 
                    continue;
            else
                break;
        }
        System.out.println();

        System.out.println("The maximum of all elements is : "+max);
    
    }
}
