class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        int slargest=-1;
        int largest=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];
            }
        }
        return slargest;
    }
}