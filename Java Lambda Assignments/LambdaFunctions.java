package LambdaExpression;

import java.util.Scanner;

public class LambdaFunctions {

	public static Calculate isOdd= (n)-> n%2 !=0;
	
	public static Calculate isPalindrome= (n) ->{
		int sum=0,reverse;
		int temp=n;
		
		while(n !=0)
		{
			reverse=n%10;
			sum=(sum*10)+reverse;
			n=n/10;
		}
		if(temp==n)return true;
		return false;
	};
	
	public static Calculate isPrime() {
		return (int num)->java.math.BigInteger.valueOf(num).isProbablePrime(1);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int number = scan.nextInt();
		
		LambdaFunctions obj= new LambdaFunctions();
	System.out.println("PRIME : " + isPrime().Check(22));
	
	}

	
}