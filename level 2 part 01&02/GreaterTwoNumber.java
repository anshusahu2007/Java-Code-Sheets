import java.util.*;

public class GreaterTwoNumber {
	public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);

	 System.out.println("enter 2 value");
	 int a = sc.nextInt();
	 int b = sc.nextInt();

	 if(a > b) {
	    System.out.println("greater is " + a);
	 }
	  else if (b > a) {
	     System.out.println("greater is " + b);
	  }
	   else {
	     System.out.println("both num is same");
	   }
	}
}