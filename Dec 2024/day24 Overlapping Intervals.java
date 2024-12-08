class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        
        int n = arr.length;
        
        List<int[]> res = new ArrayList<>();
        
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0],b[0]));
        res.add(new int[]{arr[0][0],arr[0][1]});
        
        for(int i=1;i<n;i++){
            
            int[] prev = res.get(res.size()-1);
            int[] curr = arr[i];
            
            if(curr[0] <= prev[1]){
                prev[1] = Math.max(prev[1],curr[1]);
            }
            else{
                res.add(new int[]{curr[0],curr[1]});
            }
            
        }
        return res;
    }
}
