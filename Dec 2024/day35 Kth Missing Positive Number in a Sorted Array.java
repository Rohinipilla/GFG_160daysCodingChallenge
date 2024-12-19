class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        //Linear search approach
        // for(int i=0;i<n;i++){
        //     if(arr[i]>(k+i)){
        //         return k+i;
        //     }
        // }
        // return k+n;
        
        //binary search
        int low =0,high = n-1;
        int res = k+n;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>(mid+k)){
                res = mid+k;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return res;
    }
}
