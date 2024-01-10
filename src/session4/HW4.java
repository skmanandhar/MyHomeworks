package session4;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Part1
	
		System.out.println("Please enter a number: ");
		int num = scan.nextInt();
		
		//1,
		//4,8,12,16
		
			
		System.out.print("1,");
		
		
		//num = 16
		
		
		for (int i = 4; i <= num; i = i + 4) {
			
			//i =20
			System.out.print(i);
			//Output: 4,8,12,16
			
			if (i <= num - 4) {
				System.out.print(",");
			}
		}
		
		
		//Part 2
		
		System.out.println();
		
		System.out.println("Please enter a number: ");
		int num1 = scan.nextInt();
		
		//5 4 3 2 1 0 
		
		for(int i = num1; i >= 0; i = i - 1) {
		
			
			System.out.print(i + " ");
		}
		
		
		
		//Part 3
		
		System.out.println();
		
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		String str = scan1.nextLine();
		
		//str = hello
	
		for (int i = 0; i < str.length(); i = i + 1) {
						
			System.out.print(str.charAt(i) + " ");
		}
		
		
		
		scan.close();
		scan1.close();
		
	}

}
