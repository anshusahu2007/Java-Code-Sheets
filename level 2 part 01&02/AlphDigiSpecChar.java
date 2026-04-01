import java.util.*;

public class AlphDigiSpecChar {
	public static void main(String[] args) {

	   Scanner sc = new Scanner(System.in);

	   System.out.println("enter your choice");
	   String ch = sc.next();

	   for (int i = 0; i < ch.length(); i++) {
            char str = ch.charAt(i);

	   if ((str >= 'A' && str <= 'Z') || (str >= 'a' && str <= 'z'))  {
	   	         System.out.println("Alphabet");
	   }
	     else if (str >= '0' && str <= '9')  {
	     	  System.out.println("digit");
	     } 
	       else {
             System.out.println("special Character");
	       }
	}
}
}