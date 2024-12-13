class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        int n = arr.length;
        
        int i=0,j=n-1;
        
        while(i<j){
            int mid = (i+j)/2;
            
            if(arr[i]<arr[j]){
                return arr[i];
            }
            if(arr[mid]>arr[j]){
                i = mid+1;
            }
            else{
                j = mid;
            }
            
        }
        
        return arr[i];
    }
}
