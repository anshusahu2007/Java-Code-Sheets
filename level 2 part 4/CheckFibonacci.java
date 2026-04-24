import java.util.*;

public class CheckFibonacci {
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);

	   System.out.println("enter number");
	   int number = sc.nextInt();

	   int n=0 , m=1;
         int sum = 0;

	   if(number == 0 || number == 1) {
	      System.out.print("Fibonacci number");

	   }  else {
                 
             while(sum < number) {
             	 sum = n+m;
             	 n = m;
             	 m = sum;

             	 if(sum == number) {
             	 	  System.out.print("Fibonacci series");
             	 	  return;
             	 }
             }
              System.out.print("not Fibonacci number");
                
	   }
	}
}