package day2;


public class FibonacciNumbers {

	public static void main(String[] args) {
		// Goal: To find Fibonacci Series for a given range
		//input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
		int firstnum=0,secondnum=1,sum,i,range=8; // initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		System.out.print(firstnum+" "+secondnum);
		for(i=2;i<range; i++)   
		 {    
		  sum=firstnum+secondnum;    // add first and second number assign to sum
		  firstnum=secondnum;    // Assign second number to the first number
		  secondnum=sum;    // Assign sum to the second number
		  System.out.print(" "+sum);    // print sum

		 }    
		  
		}
	}  
