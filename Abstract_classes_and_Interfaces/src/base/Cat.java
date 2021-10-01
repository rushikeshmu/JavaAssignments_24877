package base;

public class Cat extends Animal implements Printable{

	@Override
	public void talk() {
		System.out.println("Mew Mew");
		
	}

	@Override
	public void print() {
		System.out.println("This is cat");
		
	}

}
