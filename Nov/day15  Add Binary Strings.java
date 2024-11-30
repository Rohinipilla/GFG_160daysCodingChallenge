class Solution {
    
    public static String trimZeores(String s){
        
        int index = s.indexOf('1');//return first occurance of '1'
        //if there is no '1' then it returns -1
        
        return  index==-1 ? "0" : s.substring(index);
    }
    public String addBinary(String s1, String s2) {
        // code here
        
        //trimming leading zeores if any
        s1 = trimZeores(s1);
        s2 = trimZeores(s2);
        
        int n = s1.length();
        int m = s2.length();
        
        if(m>n){
            return addBinary(s2,s1);
        }
        
        int j=m-1,carry=0;
        
        StringBuilder res = new StringBuilder();
        
        //traverse from last index
        for(int i=n-1;i>=0;i--){
            
            int bit1 = s1.charAt(i)-'0';
            int sum = bit1+carry;
            
            if(j>=0){
                
                int bit2 = s2.charAt(j)-'0';
                sum +=bit2;
                j--;
            }
            
            int bit = sum%2;
            carry = sum/2;
            
            res.append((char)(bit + '0'));
        }
        
        if(carry>0){
            res.append('1');
        }
        
        return res.reverse().toString();
    }
}
