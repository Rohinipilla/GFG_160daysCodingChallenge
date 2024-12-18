class Solution {
    public static boolean check(int[] arr,int k,int limit){
        int n = arr.length;
        int pagesum = 0;
        int books = 1;
        
        for(int i=0;i<n;i++){
            
            if(pagesum+arr[i]>limit){
                books++;
                pagesum = arr[i];
            }
            else{
                pagesum += arr[i];
            }
        }
        return (books<=k);
    }
    public static int findPages(int[] arr, int k) {
        // code here
        
        int n = arr.length;
        
        if(n<k){
            return -1;
        }
        
        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();
        int res = -1;
        
        //Linear Search -- Time Limit Exceeded
        // for(int i=low;i<=high;i++){
            
        //     if(check(arr,k,i)){
        //         return i;
        //     }
        // }
        
        //Change it to binary search
        while(low<=high){
            int mid = (low+high)/2;
            
            if(check(arr,k,mid)){
                res =mid;
                high=mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        return res;
    }
}
