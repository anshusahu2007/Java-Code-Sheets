import java.util.*;

public class ArithmeticProgression {
	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);

		 System.out.println("enter a");
		 int a = sc.nextInt();

		 System.out.println("enter d");
		 int d = sc.nextInt();
       
         System.out.println("enter n");
         int n = sc.nextInt();

         for(int i=1; i<=n; i++) {
         	 System.out.print(a + " ");
         	 a = a + d;
         }
	}
}