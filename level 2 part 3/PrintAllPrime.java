import java.util.*;

public class PrintAllPrime {
	public static void main(String[] args)  {

		 Scanner sc = new Scanner(System.in);

		 System.out.println("enter number");
		 int number = sc.nextInt();

		 for(int i=2; i<=number; i++) {

		 	 boolean condition = true;
		 	 for(int j=2; j<i; j++) {
		 	 	 if(i % j == 0) {
		 	 	 	 condition = false;
		 	 	 	 break;
		 	 	 }
		 	 }
		 	   if(condition) {
		 	   	  System.out.print(i +" ");
		 	   }
		 }
	}
}