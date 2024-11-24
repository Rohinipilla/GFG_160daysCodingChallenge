class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            
            sum += arr[i];
            
            maxsum = Math.max(maxsum,sum);
            
            if(sum<0){
                sum = 0;
            }
        }
        
        return maxsum;
    }
}
