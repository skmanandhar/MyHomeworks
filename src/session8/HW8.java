package session8;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class HW8 {

	public static void main(String[] args) {
		
//		partOne();
//		partTwo();
		partThree();
		
	
	}
	
	public static void partOne() {
		/**
		 * Part 1 -- sort Array
		 */
		
		int[] num = {23,4,12,92,2,5, 333,1, 321};
		
		printArray(num);
		
		System.out.println();
		printArray(sortArray(num));
	
	}
	
	public static void printArray(int[] array) {
		
		for (int item : array) {
			System.out.print(item + " ");
		}
	}
	
	public static int[] sortArray(int[] array) {
		
		//{23 4 12 92 2 5}
		//{2 23 12 92 4 5}
		
		for (int i = 0; i < array.length; i++) {
			
			int temp = 0;
			
					
			for(int j = i + 1; j < array.length; j++) {
				
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		return array;
	}
	
	public static void partTwo() {
		/**
		 * Part 2 -- Random Number	
		 */
			
		int[] randomNumber = new int[500];
			
		System.out.println("Generating 500 random numbers...");
		
		for (int i = 0; i < 500; i++) {
			randomNumber[i] = getRandomNumber(100, 1000);
		}
			
		randomNumber = sortArray(randomNumber);
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a position number: ");
		int n = scan.nextInt();
			
		System.out.println("Position " + n + " : " + randomNumber[n-1]);
		scan.close();	
		
	}

	public static int getRandomNumber(int min, int max) {
		
		Random random = new Random();
			
		return random.nextInt(max - min) + min ;
		
	}
	
	public static void partThree() {
		/**
		 * Part 3 -- Duplicate Characters	
		 */
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		String str = scan.nextLine();
		scan.close();
		
		Map<Character, Integer> hm = new HashMap<>();
		
		int v =0;
		for (char c : str.toCharArray()) {
			v = hm.getOrDefault(c, 0) + 1;
			hm.put(c, v);
		}
		
		System.out.println("Duplicated Characters : ");
		
		for (Map.Entry<Character, Integer> item : hm.entrySet()) {
			if(item.getValue() > 1) {
				System.out.print(item.getKey() + " ");
			}
		}
	
		
	}
		
	
	

}
