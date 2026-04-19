import java.util.*;

public class ProductSum {
	 public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);

	   System.out.println("Enter number");
	   int number = sc.nextInt();
	   int lastdigit;
	   int sum = 1;

	   while(number > 0) {

	         lastdigit = number % 10;
	         sum = sum * lastdigit;

	         number = number / 10;
	   } 
	     System.out.print("total calculate of num:- " + sum);
	 }
}