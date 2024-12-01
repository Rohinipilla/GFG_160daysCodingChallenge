class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        
        int n = s.length();
        
        int[] freq = new int[26];
        
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        
        for(int i=0;i<n;i++){
            if(freq[s.charAt(i)-'a']==1){
                return s.charAt(i);
            }
        }
        
        return '$';
    }
}
