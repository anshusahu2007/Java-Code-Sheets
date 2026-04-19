import java.util.*;

public class PalindromeNumber {
	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);

		 System.out.println("Enter number");
		 int number = sc.nextInt();

		 int forward = number;
         int backward = 0;

         while(number != 0) {
              int back = number % 10;
              backward = backward * 10 + back;
              number = number / 10;
         }

          if(forward == backward) {
          	 System.out.println("Palindrome");
          } else {
          	 System.out.println("Not Palindrome");
          }
	}
}

