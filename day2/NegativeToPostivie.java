package day2;

public class NegativeToPostivie {

	public static void main(String[] args) {
		int n = -40;
		if(n>0) {
			System.out.println(n + " is positive number");
		}else if(n<0) {
		n=n*-1;  // Can be used to convert given negative number to positive number
			
			System.out.println(n + " is negative number");
		}else {
			
			System.out.println(n + " is zero");
		}
}
}
