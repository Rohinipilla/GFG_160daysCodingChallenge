
class Solution {
	public int getSecondLargest(int[] arr) {
			// Code Here
			int max1 = Integer.MIN_VALUE;
			int max2 = Integer.MIN_VALUE;
	    for(int i=0;i<arr.length;i++){
	
	        if(arr[i]>max1){
	
	            max2 = max1;
	            max1 = arr[i];
	        }
	        else if(arr[i]>max2 && arr[i]!=max1){
	            max2 = arr[i];
	        }
	
	    }
	
	    if(max1 == max2 || max2 == Integer.MIN_VALUE){
	        return -1;
	    }
	
	    return max2;
	}
}
