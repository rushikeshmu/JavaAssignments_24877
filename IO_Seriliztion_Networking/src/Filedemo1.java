
import java.io.*;
import java.util.Scanner;

public class Filedemo1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter what you want to write");
		String line = sc.nextLine();
		
		try {
		      FileWriter myWriter = new FileWriter("File1.txt");
		      myWriter.write(line);
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		

	
	}

}
