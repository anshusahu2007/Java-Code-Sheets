import java.util.*;

public class VowelConsonant {
	public static void main(String[] args) {

	  Scanner sc = new Scanner(System.in);

	  System.out.println("enter charactar");
	  char cha = sc.next().charAt(0);

	  if(cha == 'a' || cha == 'e' || cha == 'i' || cha == 'o' || cha == 'u' ||
	     cha == 'A' || cha == 'E' || cha == 'I' || cha == 'O' || cha == 'U') 
	   {
	  	    System.out.println("vowel");
	  }
	    else {
	    	 System.out.println("consonant");
	    }
	}
}