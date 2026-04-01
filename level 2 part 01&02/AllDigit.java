import java.util.*;

public class AllDigit {
	public static void main(String[] args) {

	   Scanner sc = new Scanner(System.in);

	   System.out.println("enter 3 digit");
	   int number = sc.nextInt();

	   int first = (number / 100);
	   int middle = (number / 10) % 10;
	   int last = (number % 10);

	   int result = (first * middle * last);

	   System.out.println("rusult is :- " + result);
	}
}