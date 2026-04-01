import java.util.*;

public class NumIsPosiNegaZero {
	public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);

	 System.out.println("enter Number");
	 int number = sc.nextInt();

	 if(0 > number) {
	      System.out.println("value is negative");
	 }
	 else if(0 < number) {
	      System.out.println("value is positive");
	 }
	  else {
	   System.out.println("value is zero");
	  }
	}
}