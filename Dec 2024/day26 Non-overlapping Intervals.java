class Solution {
    static int minRemoval(int intervals[][]) {
        // code here
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int n = intervals.length;
        int count = 0;
        
        int end = intervals[0][1];
        for(int i=1;i<n;i++){
            
            if(intervals[i][0]<end){
                count++;
                end = Math.min(end,intervals[i][1]);
            }
            else{
                end = intervals[i][1];
            }
            
        }
        return count;
    }
}
