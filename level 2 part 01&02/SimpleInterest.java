import java.util.*;

public class SimpleInterest {
	public static void main(String[] args) {

	   Scanner sc = new Scanner(System.in);

	   System.out.println("enter principle amount");
       double PrincipalAmount = sc.nextDouble();

	   System.out.println("enter Rate Of Interest");
	   double RateOfInterest = sc.nextDouble();

	   System.out.println("enter Time of period");
	   double TimePeriod = sc.nextDouble();

	   double SimpleInterest = PrincipalAmount * RateOfInterest * TimePeriod / 100;  
       double TotalAmount = PrincipalAmount + SimpleInterest; 

       System.out.println(TotalAmount);
	}
}