import java.util.*;
public class FindFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Print all the factors of that number :");

        System.out.print("Enter Any Number to find all the factors :");
        int num=sc.nextInt();
        System.out.println();
        System.out.print("The factors of "+num+" is = ");
        for(int i=1;i<=num;i++) {
            if(num%i==0)
                System.out.print(i+", ");
        }
    }
}
