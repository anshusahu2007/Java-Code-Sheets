import java.util.*;

public class GCD {
	public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);

          System.out.println("enter number");
          int a = sc.nextInt();

          System.out.println("enter second number");
          int b = sc.nextInt();

          while(b != 0)  {
            int remainder = a % b;
        	  a = b;
        	  b = remainder;
          }
           System.out.print("GCD "+ a);
        }
}