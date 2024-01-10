package session6;

public class ClassTwo {
	
	static String school = "TechFios";
	String name;
	String grade;
	
	
	public ClassTwo(String name, String grade) {
		System.out.println("Constructor with 2 arguments invoked!");
		
		System.out.println("School: " + school);
		System.out.println("Name: " + name);
		System.out.println("Grade: "+ grade);
		
	}
	
	public ClassTwo(String name) {
		this(name, "NA");
		System.out.println("Constructor with 1 argument invoked!");
	}
	
	public ClassTwo() {
		this("No Name");
		System.out.println("Constructor with no argument invoked!");
	}
	
}
