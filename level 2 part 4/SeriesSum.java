import java.util.*;

public class SeriesSum {
	public static void main(String[] args) {

	  Scanner sc = new Scanner(System.in);

	  System.out.println("enter number");
	  int number = sc.nextInt();

	  int sum = 0;

	  for(int i=1; i<=number; i++) {
	      if(i % 2 == 0) {
	        sum -= i;
	      } else {
	           sum += i;
	      }
	  }

	    System.out.println("sum of series " + sum);
	}
}