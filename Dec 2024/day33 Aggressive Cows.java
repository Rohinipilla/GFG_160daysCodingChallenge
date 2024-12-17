class Solution {
    public static boolean canweplace(int[] stalls,int dist,int k){
        
        int n = stalls.length;
        int last = stalls[0],count = 1;
        
        for(int i = 1;i<n;i++){
            
            if(stalls[i]-last>=dist){
                count++;
                last = stalls[i];
            }
            if(count>=k){
                return true;
            }
        }
        return false;
    }
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        
        int n = stalls.length;
        
        int low =1,high = stalls[n-1]-stalls[0];
        
        while(low<=high){
            int mid = (low+high)/2;
            
            if(canweplace(stalls,mid,k)){
                low = mid +1;
            }
            else{
                high = mid-1;
            }
        }
        return high;
    }
}
