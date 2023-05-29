package week2.day1;

public class FindSecondLargest {

	public static void main(String[] args) {
//		 FindSecondLargest
//			// Here is the input
//			int[] data = {3,2,11,4,6,7};
//
//			
//			/*
//			 Pseudo Code:
//			 1) Arrange the array in ascending order
//			 2) Pick the 2nd element from the last and print it
		
		            
		        //Initialize array     
		        int [] arr = new int [] {3,2,11,4,6,7};     
		        int temp = 0;    
		            
		        //Displaying elements of original array    
		        System.out.println("Elements of original array: ");    
		        for (int i = 0; i < arr.length; i++) {     
		            System.out.print(arr[i] + " ");    
		        }    
		            
		        //Sort the array in ascending order    
		        for (int i = 0; i < arr.length; i++) {     
		            for (int j = i+1; j < arr.length; j++) {     
		               if(arr[i] > arr[j]) {    
		                   temp = arr[i];    
		                   arr[i] = arr[j];    
		                   arr[j] = temp;    
		               }     
		            }     
		        }    
		          
		        System.out.println();    
		            
		        //Displaying elements of array after sorting    
		        System.out.println("Elements of array sorted in ascending order: ");    
		        for (int i = 0; i < arr.length; i++) {     
		            System.out.print(arr[i] + " ");
		          //Pick the 2nd element from the last and print it
		            int ele=arr[arr.length-2]; 
		            System.out.println(ele);
		            
		            
		            
		            }
		        }    
		    }    
		 
	


