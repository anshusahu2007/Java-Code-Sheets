import java.util.*;

public class NFibonacci {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);

	  System.out.println("enter number");
	  int number = sc.nextInt();

	  int n=0 , m = 1;
      int sum = 0;

	 if(number == 1) {
	    System.out.print(n);

	 } else if(number == 2) {
	   System.out.print(m);

	 } else {
	   for(int i=3; i<=number; i++) {

        sum = n+m;

	     n=m;
	     m=sum;

	   }
	     System.out.print("n position is " + sum);
	 }

    }
}