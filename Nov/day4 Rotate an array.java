class Solution {
    
    
    static void reverseArray(int arr[],int i,int j) {
        // code here
        
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++;
            j--;
        }
    }
    
    static void rotateArr(int arr[], int d) {
        // add your code here
        
        int n = arr.length;
        d = d%n;
        
        reverseArray(arr, 0, d - 1);
        
        reverseArray(arr, d, n - 1);

        reverseArray(arr, 0, n - 1);
    }
}
