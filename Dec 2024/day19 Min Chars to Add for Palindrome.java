class Solution {
    public static int LPS(String s){
        int len =0;
        int i=1;
        int n = s.length();
        
        int[] lps = new int[n];
        lps[0] = 0;
        
        while(i<n){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lps[i]=len;
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
        return lps[n-1];
        
    }
    public static int minChar(String s) {
        // Write your code here
        int n = s.length();
        
        String rev = new StringBuilder(s).reverse().toString();
        
        s = s+'$'+rev;
        
        int m = LPS(s);
        
        return (n-m);
    }
}
