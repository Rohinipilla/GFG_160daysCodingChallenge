class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int n = arr.length;
        int left=0,right=n-1,index=0;
        while(index<=right){
            if(arr[index]==0){
                
                int temp = arr[index];
                arr[index]=arr[left];
                arr[left] = temp;
                index++;
                left++;
            }
            else if(arr[index]==2){
                int temp = arr[index];
                arr[index]=arr[right];
                arr[right] = temp;
                right--;
            }
            else index++;
        }
    }
}
