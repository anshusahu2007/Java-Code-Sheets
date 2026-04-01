import java.util.*;

public class SwapThreeNumbersCyclically {
	 public static void main(String[] args) {

	   Scanner sc = new Scanner(System.in);

	   System.out.println("enter three values");
	   int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();

       System.out.println("before swap = a "+a);
        System.out.println("before swap = b "+b);
         System.out.println("before swap = c "+c);

       int temp = a;
       a = b;
       b = c;
       c = temp;

         System.out.println("After swap = a "+a);
        System.out.println("After swap = b "+b);
         System.out.println("After swap = c "+c);
	 }
}