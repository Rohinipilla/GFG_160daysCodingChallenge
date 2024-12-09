//Approach 1:
class Solution {
    static ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        
        int n = arr.length;
        
        ArrayList<int[]> res = new ArrayList<>();
        
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
    public static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        // code here
        ArrayList<int[]> arr = new ArrayList<>(Arrays.asList(intervals));
        arr.add(newInterval);
        return mergeOverlap(arr.toArray(new int[0][]));
    }
}


//Approach 2 :
class Solution {
    
    public static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        // code here
        ArrayList<int[]> res = new ArrayList<>();
        int i=0;
        int n = intervals.length;
        
        while(i<n && intervals[i][1]<newInterval[0]){
            res.add(intervals[i]);
            i++;
        }
        
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        res.add(newInterval);
        
        while(i<n){
            res.add(intervals[i]);
            i++;
        }
        
        return res;
        
    }
}
