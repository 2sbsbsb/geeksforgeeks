package arrays;

import java.util.Arrays;

public class PairSum {

	static class Index {
		
		int firstIndex;
		int secondIndex;
		
		/**
		 * @param firstIndex
		 * @param secondIndex
		 */
		public Index(int firstIndex, int secondIndex) {
			super();
			this.firstIndex = firstIndex;
			this.secondIndex = secondIndex;
		}

		/**
		 * @return
		 */
		public int getFirstIndex() {
			return firstIndex;
		}

		/**
		 * @return
		 */
		public int getSecondIndex() {
			return secondIndex;
		}
		
		public boolean isFound() {
			return firstIndex!=0 && secondIndex!=0;
		}

		@Override
		public String toString() {
			return "Index [firstIndex=" + firstIndex + ", secondIndex=" + secondIndex + "]";
		}
		
	}
	
	/**
	 * @param arr
	 * @param sum
	 * @return
	 */
	public Index findPair(int[] arr, int sum) {
		// If the array is not sorted, sort it is nlog(n) ways 
		Arrays.sort(arr);
		int i = 0;
		int j = arr.length-1;		
		while(i<j) {
			if(arr[i]+arr[j]==sum) {
				return new Index(i,j);
			} else if(arr[i]+arr[j]<sum){
				i++;
			} else if(arr[i]+arr[j]>sum){
				j--;
			}
		}
		return new Index(0,0);		
	}
	
	
	
	public static void main(String[] args) {
		PairSum pairSum = new PairSum();
		int[] arr = {2,1,55,3,92,11,7,6,23,32};
		Index result = pairSum.findPair(arr, 31);		
		System.out.println(result.isFound() ? " Successful" : " Failure");		
	}

}
