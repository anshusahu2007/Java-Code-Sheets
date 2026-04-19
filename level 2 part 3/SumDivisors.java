import java.util.*;

public class SumDivisors {
	public static void main(String[] args) {

	   Scanner sc = new Scanner(System.in);

	   System.out.println("enter number");
	   int number = sc.nextInt();
       
       int sum = 0;

	   for(int i=1; i<=number; i++) {
	       if(number % i == 0) {
	          System.out.println(i);
	          sum = sum + i;
	       }
	   }
	     System.out.println("total sum is "+ sum);
	}
}