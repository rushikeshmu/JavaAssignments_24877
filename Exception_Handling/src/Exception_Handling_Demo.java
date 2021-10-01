
public class Exception_Handling_Demo {

	public static void main(String[] args) {
		 int[] arr = new int[4];
         
	        try
	        {
	        	try {
	        		
	        		
	        		System.out.println(10/0);
	        	}
	        	catch(Exception e) {
	        		System.out.println("Inner try-catch block");
	        		e.printStackTrace();
	        		
	        	}
	            int i = arr[4];
	                  
	            // this statement will never execute
	            // as exception is raised by above statement
	            System.out.println("Inside try block");
	        }
	          
	        // not a appropriate handler
	        catch(NullPointerException ex)
	        {
	            System.out.println("Exception has been caught");
	         System.out.println(  ex.getMessage());
	        
	        }
	        catch(ArrayIndexOutOfBoundsException ex) {
	        	ex.printStackTrace();
	        	
	        }
	        catch(Exception ex) {
	        	 ex.printStackTrace();
	        }
	          
	        finally
	        {
	            System.out.println("finally block executed");
	        }
	          
	        // rest program will not execute
	        System.out.println("Outside try-catch-finally clause");
		

	}

}
