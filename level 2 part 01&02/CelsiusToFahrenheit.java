import java.util.*;

public class CelsiusToFahrenheit {
	public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);

	 System.out.println("enter temperatur");
	 double celsius = sc.nextDouble();

	double Fahrenheit = (celsius * 9/5) + 32;

	System.out.println(Fahrenheit);
	}
}