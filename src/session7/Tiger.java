package session7;

public class Tiger extends Animal{
	
	
	@Override
	public void eat() {
				
		super.eat();
		System.out.println("Tiger loves meat");
		
				
	}
	
	public void eat(String food) {
		System.out.println("Tiger loves to eat " + food);
	}


	
}
