package session3;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a String : ");
		String answer = scan.nextLine();
		
		String answer1 = answer.toUpperCase();
		
		System.out.println("2. In Uppercase: " + answer1);
		System.out.println("3. String Length: " + answer1.length());
		
		answer1 = answer1.replace('O','Z');
		
		System.out.println("4. O replaced with Z: " + answer1);
		
		System.out.println("5. Last character in string: " + answer1.charAt(answer1.length()-1));
		
		System.out.println("6. Concatenation with the input: " + answer + " Test");
		
		scan.close();

	}

}
