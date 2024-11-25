
class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        
        int n = arr.length;
        
        int pref = 1,suff=1;
        int res = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            
            if(pref==0) pref = 1;
            if(suff==0) suff = 1;
            
            pref *= arr[i];
            suff *= arr[n-i-1];
            
            res = Math.max(pref,Math.max(res,suff));
            
        }
        
        return res;
    }
}
