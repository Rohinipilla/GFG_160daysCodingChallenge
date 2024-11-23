class Solution {
    public int getMinDiff(int k, int[] arr) {
        // code here
        
        int n =arr.length;
        
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        
        Arrays.sort(arr);
        
        int res = arr[n-1]-arr[0];
        
        for(int i=1;i<n;i++){
            
            
            max = Math.max(arr[i-1]+k,arr[n-1]-k);
            min = Math.min(arr[0]+k,arr[i]-k);
            res = Math.min(res,max-min);
            
        }
        
        return res;
    }
}
