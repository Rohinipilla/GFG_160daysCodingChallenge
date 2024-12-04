class Solution {
    // Function to check if two strings are rotations of each other or not.
    
    public static void LPS(int[] lps,String s){
        
        int n = s.length();
        
        int len =0;
        lps[0] = 0;
        int i=1;
        
        while(i<n){
            
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len !=0){
                    len = lps[len-1];
                }
                else{
                    lps[i] = 0;
                    i++;
                }
            }
            
        }
    }
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        
        String txt = s1+s1;
        String pat = s2;
        
        int n = txt.length();
        int m = pat.length();
        
        int[] lps = new int[m];
        
        LPS(lps,pat);
        
        int i =0,j=0;
        
        while(i<n){
            
            if(pat.charAt(j) == txt.charAt(i)){
                i++;
                j++;
            }
            if(j==m){
                return true;
            }
            else if(i < n && pat.charAt(j) != txt.charAt(i)){
                
                if(j != 0 ){
                    j = lps[j-1];
                }
                else{
                    i++;
                }
                
            }
            
        }
        return false;
    }
}
