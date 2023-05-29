package week2.day1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// Declare all variables
		   {
		      String input="Welcome to Java Session Java Session Session Java";  //Input String 
		      String[] count=input.split(" ");   //Split the word from String
		      for(int i=0;i<count.length;i++)  //Outer loop for Comparison       
		      {
		         if(count[i]!=null)
		         {
		         
		         for(int j=i+1;j<count.length;j++)  //Inner loop for Comparison
		         {
		            
		         if(count[i].equals(count[j]))  //Checking for both strings are equal
		            {
		               count[j]=null;  //Delete the duplicate words
		            }
		         }
		         }
		      }
		      for(int k=0;k<count.length;k++)  //Displaying the String without duplicate words    
		      {
		         if(count[k]!=null)
		         {
		            System.out.println(count[k]);
		         }
		         
		        }  
		   }
	}
}
		