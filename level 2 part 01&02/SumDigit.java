import java.util.*;

public class SumDigit {
	  public static void main(String[] args) {

	   Scanner sc = new Scanner(System.in);

	   System.out.println("enter three digit number");
	   int number = sc.nextInt();

	   int LastDigit = (number % 10);
	   int Middle = (number / 10) % 10;
	   int FirstDigit = (number / 100);

	   int sum = (LastDigit + Middle + FirstDigit);
	   System.out.println(sum);
	  }
}