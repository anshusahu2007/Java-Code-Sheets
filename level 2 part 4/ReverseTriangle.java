import java.util.*;

public class ReverseTriangle {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);

	 System.out.println("enter number");
	 int number = sc.nextInt();

	 for(int i=1; i<=number; i++) {
	 	 for(int j=i; j>=1; j--) {
	 	 	 System.out.print(j+" ");
	 	 }
	 	  System.out.println();
	 }
	}
}