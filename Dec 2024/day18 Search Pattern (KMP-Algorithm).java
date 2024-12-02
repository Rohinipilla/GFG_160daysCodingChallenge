class Solution {
    
    static void LPS(int[] lps,String pat){
        
        int n = pat.length();
        
        int len =0;
        lps[0]=0;
        
        int i = 1;
        
        while(i<n){
            
            if(pat.charAt(i) == pat.charAt(len)){
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

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        int m = pat.length();
        int n = txt.length();
        
        int[] lps = new int[m];
        
        LPS(lps,pat);
        
        ArrayList<Integer> res = new ArrayList<>();
        
        int i=0,j=0;
        
        while(i<n){
            
            if(pat.charAt(j) == txt.charAt(i)){
                i++;
                j++;
                
                if(j==m){
                    res.add(i-j);
                    
                    j = lps[j-1];
                }
            }
            else{
                if(j != 0 ){
                    j = lps[j-1];
                    
                }
                else{
                    i++;
                }
            }
        }
        return res;
    }
}
