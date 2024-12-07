class Solution {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        // code here
        
        int n = citations.length;
        
        int freq[] = new int[n+1];
        
        for(int i=0;i<n;i++){
            
            if(citations[i]>=n){
                freq[n] +=1;
            }
            else{
                freq[citations[i]]+=1;
            }
        }
        
        int sum = freq[n];
        int i = n;
        while(sum < i){
            i--;
            sum += freq[i];
        }
        return i;
    }
}
