import java.util.*;

public class NumberInYearWeakDay {
	public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);

	 System.out.println("Enter Number");
	 int number = sc.nextInt();

	 int year = number / 365;
	 int remaining = number % 365;

	 int weaks = remaining / 7;
	 int days = remaining % 7;

	 System.out.println("year = " + year);
	 System.out.println("weak = " + weaks);
	 System.out.println("days = " + days);
	}
}