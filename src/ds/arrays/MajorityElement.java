package ds.arrays;

import java.util.Scanner;

/**
 * 
 * Majority Element: A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).
 * Write a function which takes an array and emits the majority element (if it exists), otherwise prints NONE as follows:
 *
 */
public class MajorityElement {

	// Comment
	public static void main (String[] args) {
		// Input the number of test cases you want to run
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        // One by one run for all input test cases
        while (t > 0) {
            // Input the size of the array
            int n = sc.nextInt();
            int[] arr = new int[n];
              // Input the array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(solutions(arr));
            t--;   
        }
	}
	
	/**
	 * */
	public static String solutions(int[] arr) {
		int potentialMajority = findPotentialMajority(arr);
		// Verify if it is still majority
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==potentialMajority) {
				count++;
			}
		}
		return (count>arr.length/2) ? String.valueOf(potentialMajority) : "NO Majority Element";
	}
	
	
	public static int findPotentialMajority(int[] arr) {
		 int m=0;
		    int count=0;
			for(int i=0;i<arr.length;i++) {
		    	if(count==0) {
		    		m = arr[i];
		    		count = 1;
		    	} else {
		    		if(arr[i]==m) {
		    			count++;
		    		} else {	    			
		    			count--;		    			
		    		}
		    	}
		    }
			return m;
	}
	
	
}
