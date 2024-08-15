import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Fibonacci Series : ");

        System.out.print("Enter the No of Fibonacci Series : ");
        int num=sc.nextInt();

        if(num>0){
            int first=0,second=1;
            System.out.println("The Fibonacci series are : ");
            System.out.print(first+"   "+second);

            for(int i=0;i<num-2;i++){
                int temp=Fibonacci(first,second);
                System.out.print("  "+temp);
                first=second;
                second=temp;
            }
        } else
        System.out.println("Please Enter +ve integer !!");
    }
    public static int Fibonacci(int frst, int secnd) {
        return frst+secnd;
    }
}
