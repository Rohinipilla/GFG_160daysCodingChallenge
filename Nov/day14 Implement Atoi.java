class Solution {
    public int myAtoi(String s) {
        // Your code here
        
        int i=0;
        int n = s.length();
        int sign = 1;
        int res = 0;
        
        // removing the space any before the string
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        //checking the sign of the number
        if(i<n && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            
            if(s.charAt(i)=='-'){
                sign = -1;
            }
            i++;
        }
        
        while(i<n &&(s.charAt(i)>='0' && s.charAt(i)<='9')){
            
            if(res>Integer.MAX_VALUE /10 || (res==Integer.MAX_VALUE/10 
            && s.charAt(i)-'0'>'7')){
                return sign== 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE; 
            }
            
            res = res*10 + (s.charAt(i)-'0');
            i++;
        }
        
        return res*sign;
    }
}
