class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n = a.length;
        int m = b.length;
        
        //we have to sort the elemnts in the arrays 
        //if we have the a-last element is greater than b-first element
        
        int i=n-1,j=0;
        
        while(i>=0 && j<m){
            
            //we have to swap when a[i]>b[j]
            if(a[i]>b[j]){
                int temp = a[i];
                a[i] =b[j];
                b[j] = temp;
                
                i--;
                j++;
            }
            else{
                break;
            }
        }
        
        //now the first n small numbers are in a
        //and last m greater numbers are in b
        //now we have to sort the two arrays in-place
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
