package base;

public class Utility {
	
	public static void printAll(Printable [] p) {
		
		
		for(Printable q : p) {
			
			q.print();
		}
		
	}

	public static void main(String[] args) {
		
		Printable [] p = { new  Cat(),new Dog(),new Circle(10) };
		printAll(p);
		
		
		
		

	}

}
