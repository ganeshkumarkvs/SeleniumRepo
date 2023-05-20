package day2;

public class Factorial {

	public static void main(String[] args) {
		int a = 5; // Declare your input as 5
		int i, fact = 1; // Declare an integer variable fact as 1
		for (i = 1; i <= a; i++) { // Iterate from 1 to your input (tip: using loop concept)
			fact = fact*i; 
			
		}
		  System.out.println("Factorial of "+a+" is: "+fact);    

	}

}
