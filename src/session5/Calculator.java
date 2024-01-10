package session5;

public class Calculator {
	
	public static void add(Double number1, Double number2) {
		
		System.out.println("The sum of " + number1 + " and " + number2 +
				" is " + (number1 + number2));
	}

	public static void subtract(Double number1, Double number2) {
		
		System.out.println("The difference between " + number1 + " and " + number2 +
				" is " + (number1 - number2));
	}
	
	public void multiply(Double number1, Double number2) {
		
		System.out.println("The product of " + number1 + " and " + number2 +
				" is " + (number1 * number2));
	}

	public void divide(Double number1, Double number2) {
		
		System.out.println( number1 + " divided by " + number2 +
					" is " + (number1 / number2));
		
	}
		
}
