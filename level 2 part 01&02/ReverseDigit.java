import java.util.*;

public class ReverseDigit {
	public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);

	 System.out.println("enter 2 digit");
	 int number = sc.nextInt();

	 int First = (number % 10);
	 int Last = (number / 10);

	 System.out.println(First + " "+ Last);
	}
}