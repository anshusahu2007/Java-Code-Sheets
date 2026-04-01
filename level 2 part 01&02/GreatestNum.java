import java.util.*;

public class GreatestNum {
	 public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);

	 System.out.println("enter three number");
	 int a = sc.nextInt();
	 int b = sc.nextInt();
	 int c = sc.nextInt();

	 if ((a > b) && (a > c)) {
	   System.out.println("gretest is " + a);
	 }
	  else if ((b > a) && (b > c)) {
	    System.out.println("gretest is " + b);
	  }
	    else {
	     System.out.println("gretest is " + c);
	    }
	 }
}