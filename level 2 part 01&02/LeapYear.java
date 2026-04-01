import java.util.*;

public class LeapYear {
	public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);

	 System.out.println("enter year");
	 int year = sc.nextInt();

	 if(year % 4 == 0) {
	      System.out.println("Leap Year");
	 }
	    else {
	       System.out.println("not Leap year");
	    }
	}
}