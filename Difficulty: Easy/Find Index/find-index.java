// User function Template for Java

class Solution {
    // Function to find starting and end index
    static int[] findIndex(int arr[], int key) {
        // code here.
        int n=arr.length;
        int index1=-1;
        int index2=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                index1=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]==key){
                index2=i;
                break;
            }
        }
        return new int[] {index1,index2};
    }
}