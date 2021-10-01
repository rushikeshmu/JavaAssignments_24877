package LambdaExpression;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int number = scan.nextInt();
		
		//Palindrome
		int temp= number;
		MyInterface ref= (n) ->{
			int sum=0;
			while(n>0)
			{
				int  reverse=n%10;
				sum=(sum*10)+reverse;
				n=n/10;
			}
			return sum;
		
		};
		
		if(ref.isPalindrome(number)==temp)
		{
			System.out.println("PALINDROME");
		}
		else
		{
			System.out.println("NOT PALINDROME");
		}
		

	}

}
