import java.util.*;

public class ReverseNumber {
	 public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);

	   System.out.println("enter a number");
	   int number = sc.nextInt();
	   int digit;

	   while(number > 0) {

	   	  digit = number % 10;
	   	   System.out.print(digit+" ");

	   	  number = number / 10;
	    }
	 }
}