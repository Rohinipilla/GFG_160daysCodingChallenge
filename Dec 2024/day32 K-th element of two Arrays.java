class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        
        int n = a.length;
        int m = b.length;
        
        int left=0,right=0;
        
        int res = 0;
        
        while(k>0){
            
            if(left<n &&(right>=m || a[left]<b[right])){
                res = a[left];
                left++;
            }
            else{
                res = b[right];
                right++;
            }
            k--;
        }
        return res;
    }
}
