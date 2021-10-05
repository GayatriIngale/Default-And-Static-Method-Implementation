package defaultandStaticMethod;

public interface Dog {
	
	default void bark() {
		System.out.println(" In default method: Dog is barking");
	}
	
	static void eat() {
		System.out.println(" In Static method: Dog is eating");
	}




public class DogAction implements Dog{}
	public static void main(String args[]) {
		new DogAction().bark();
		Dog.eat();
	}
	
	
}
