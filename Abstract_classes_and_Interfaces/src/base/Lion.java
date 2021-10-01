package base;

public class Lion extends Animal implements Printable {

	@Override
	public void talk() {
		System.out.println("Roring");
		
	}

	@Override
	public void print() {
		System.out.println("This is lion");
		
	}
	

}
