import java.util.*;

public class SumDigitNumber {
	 public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int sum = 0;

	   System.out.println("enter a number ");
	   int number = sc.nextInt();
	   int digit = 0;

	   while(number > 0) {

	       digit = digit + (number % 10);
	       number = number / 10;
	   }
	     System.out.println(digit);
	 }
}