import java.util.*;

public class SumSeries {
	public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);

	   System.out.println("enter number");
	   int number = sc.nextInt();

	   double sum = 0;

	   for(int i=1; i<=number; i++) {
	   	 sum = sum + (1.0 / i);
	   }
	     System.out.println("total sum "+sum);
	}
}