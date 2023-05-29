package week2.day1;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		{
			  
			int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	  
	        int max = Integer.MIN_VALUE;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > max)
	                max = arr[i];
	        }
	  
	        int x[] = new int[max + 1];
	        for (int i = 0; i < arr.length; i++) {
	  
	            // increment in array x for every integer
	            // in arr.
	            x[arr[i]]++;
	        }
	        for (int i = 0; i <= max; i++) {
	            // output only if element is more than
	            // 1 time in array arr.
	            if (x[i] > 1)
	                System.out.println(i + "-" + x[i]);
	}

		}
	}
}
