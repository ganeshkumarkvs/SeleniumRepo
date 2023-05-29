package week2.day1;

import java.util.Scanner;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		//Convert the String to character array
		char[] ch = new char[test.length()];
		
		//Traverse through each character (using loop)
		for (int i = 0 ; i < test.length(); i++) {
            ch[i] = test.charAt(i);
           
            System.out.println(i);
            //find the odd index within the loop (use mod operator)
      
          Scanner scanner = new Scanner(System.in);
          System.out.println("Please enter some number: ");
          int numberEnterByUser = scanner.nextInt();
           
          if (numberEnterByUser %2 == 0) {
        	  System.out.println("The number "+numberEnterByUser +" is even.");
          }
          else {
        	  System.out.println("The number "+numberEnterByUser +" is odd.");

        //within the loop, change the character to uppercase, if the index is odd else don't change	  
        	        String x = "Hello World";
        	        StringBuilder sb = new StringBuilder();
        	        for(int j=0;j<=x.length();j++){
        	             char c = x.charAt(i);
        	             if(i%2==0){
        	                sb.append(String.valueOf(c).toUpperCase());
        	             } else {
        	                sb.append(String.valueOf(c).toLowerCase());
        	             }
        	        }
        	      System.out.println(sb.toString());
        	    }
          }
        		  
		}
	}

		


