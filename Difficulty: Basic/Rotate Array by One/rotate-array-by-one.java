// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        // code here
        int n=arr.length;
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=arr[i];
        }
        for(int i=1;i<n;i++){
            arr[i]=arr1[i-1];
        }
        arr[0]=arr1[n-1];
    }
}