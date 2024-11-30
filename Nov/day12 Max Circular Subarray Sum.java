class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {

        // Your code here
        int n = arr.length;
        int total = 0;
        
        int currMaxSum = 0,currMinSum =0;
        
        int maxSum = arr[0],minSum = arr[0];
        
        for(int i=0;i<n;i++){
            
            currMaxSum = Math.max(currMaxSum+arr[i],arr[i]);
            maxSum = Math.max(maxSum,currMaxSum);
            
            currMinSum = Math.min(currMinSum+arr[i],arr[i]);
            minSum = Math.min(minSum,currMinSum);
            
            total +=arr[i];
        }
        
        int nrmlSum = maxSum;
        
        int cirSum = total - minSum;
        
        if(total == minSum){
            return nrmlSum;
        }
        
        return Math.max(nrmlSum,cirSum);
    }
}
