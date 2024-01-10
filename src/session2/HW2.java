package session2;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {

		questionnaire();

	}

	public static void questionnaire() {

		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);

		System.out.println("What is your name? ");
		String name = scan.nextLine();

		System.out.println("How old are you? ");
		int age = scan1.nextInt();
		
		
		System.out.println("What is your gender? ");
		String gender = scan.nextLine();

		System.out.println("Where are you from? ");
		String address1 = scan.nextLine();

		System.out.println("Where do you live now? ");
		String address2 = scan.nextLine();

		System.out.println("Where do you work? ");
		String work = scan.nextLine();

		System.out.println("What is you job role? ");
		String job = scan.nextLine();

		System.out.println("What is your salary? ");
		int salary = scan1.nextInt();

		System.out.println("How much raise are you getting next year? ");
		int raise = scan1.nextInt();

		int totalSalary = salary + raise;

		System.out.println("My name is " + name + ". I am " + age + " years old, " + gender + ". I work at " + work
				+ " as " + job + ". I currently live in " + address2 + ". I am originally from " + address1
				+ ". I make " + salary + " dollar. I will get " + raise + " as annual raise so my "
				+ "total salary would be " + totalSalary + " dollar next year.");
		scan.close();
		scan1.close();
	}

}
