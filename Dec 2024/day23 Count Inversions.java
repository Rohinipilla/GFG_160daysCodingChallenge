class Solution {
    // Function to count inversions in the array.
    static int merge(int[] arr,int l,int m,int r){
        
        int count =0;
        int left = l;
        int right = m+1;
        
        ArrayList<Integer> res = new ArrayList<>();
        while(left<=m && right <= r){
            
            if(arr[left]<=arr[right]){
                
                res.add(arr[left]);
                left++;
            }
            else{
                res.add(arr[right]);
                count += (m-left+1);
                right++;
            }
        }
        
        while(left<=m){
            res.add(arr[left]);
            left++;
        }
        while(right<=r){
            res.add(arr[right]);
            right++;
        }
        
        for(int i=l;i<=r;i++){
            arr[i] = res.get(i-l);
        }
        return count;
    }
    static int mergeSort(int[] arr,int l,int r){
        
        int count =0;
        int m;
        
        if(l<r){
            m = (l +r)/2;
            
            count += mergeSort(arr,l,m);
            count += mergeSort(arr,m+1,r);
            count += merge(arr,l,m,r);
        }
        
        return count;
        
    }
    
    static int inversionCount(int arr[]) {
        // Your Code Here
        return mergeSort(arr,0,arr.length-1);
    }
}
