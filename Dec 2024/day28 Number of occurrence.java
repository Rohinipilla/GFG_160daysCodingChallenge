class Solution {
    static int first(int[] arr,int n,int x){
        
        int low =0,high=n-1,first=-1;
        
        while(low<=high){
            int mid = low +(high-low)/2;
            
            if(arr[mid]==x){
                first = mid;
                
                high = mid-1;
            }
            else if(arr[mid]<x){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        
        return first;
    }
    static int last(int[] arr,int n,int x){
        
        int low =0,high=n-1,last=-1;
        
        while(low<=high){
            int mid = low +(high-low)/2;
            
            if(arr[mid]==x){
                last = mid;
                
                low= mid+1;
            }
            else if(arr[mid]<x){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        
        return last;
    }

    int countFreq(int[] arr, int target) {
        // code here
        int n = arr.length;
        int first = first(arr,n,target);
        
        if(first == -1){
            return 0;
        }
        
        int last = last(arr,n,target);
        
        return last-first+1;
    }
}
