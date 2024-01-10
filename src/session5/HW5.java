package session5;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Scanner scan1 =  new Scanner(System.in);
		
		// PART 1 - Calculator
		
		Calculator calc = new Calculator();
		
		System.out.println("Please enter a number: ");
		double number1 = scan.nextDouble();
		
		System.out.println("Please enter another number: ");
		double number2 = scan.nextDouble();
		
		System.out.println("Please enter math operation (Add/Sub/Multi/Div): ");
		String operator = scan1.nextLine().toUpperCase();
		
		switch (operator) {
			
			case "ADD":
			case "A":
				
				Calculator.add(number1, number2);
				break;
		
			case "SUB":
			case "S":
				
				Calculator.subtract(number1, number2);
				break;
			
			case "MULTI":
			case "M":
				
				calc.multiply(number1, number2);
				break;
			
			case "DIV":
			case "D":
				
				calc.divide(number1, number2);
				break;
			
			default:
				System.out.println("Invalid Input!!");
				
		}
		
		
		
		// PART 2 - Palindrome
		
		
		System.out.println("Enter a word: ");
		String word = scan1.nextLine();
		
		int len = word.length();
		String reverse = "";
		
		//civic
		
		for (int i = len-1; i >=0; i--) {
			reverse = reverse + word.charAt(i);
			
		}
		
		if (word.equals(reverse)) {
			System.out.println(word + " is a palindrome.");
		}
		else {
			System.out.println(word + " is NOT a palindrome.");
		}
		
		
		// PART 3 - ODD/EVEN
		
		
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + " is EVEN.");
			
		}
		else {
			System.out.println(num + " is ODD.");
		}
		
		
		scan.close();
		scan1.close();
	}

}
