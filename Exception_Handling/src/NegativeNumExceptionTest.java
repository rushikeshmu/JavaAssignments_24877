
public class NegativeNumExceptionTest {

	public static void main(String[] args) {
	try {
		if(Double.parseDouble(args[0]) <0) {
			
			throw new NegativeNumberException();
			
		}
		else {
			System.out.println(Math.sqrt(Double.parseDouble(args[0])));
			
		}
		
		
		
	}
	catch(NegativeNumberException ex) {
		System.out.println("Handling Negative Number Exception");
		
		
	}

	}

}
