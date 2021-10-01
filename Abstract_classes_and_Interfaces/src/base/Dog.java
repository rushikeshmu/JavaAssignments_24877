package base;

public class Dog extends Animal implements Printable {

	@Override
	public void talk() {
		System.out.println("Bho Bho");
		
		
	}

	@Override
	public void print() {
		System.out.println("This is dog");
		
	}

}
