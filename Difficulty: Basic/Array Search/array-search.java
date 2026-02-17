// User function Template for Java
class Solution {
    public int search(int k, ArrayList<Integer> arr) {
        // code here
        int n=arr.size();
        Integer[] arr1=arr.toArray(new Integer[arr.size()]);
        for(int i=0;i<n;i++){
            if(arr1[i]==k){
                return (i+1);
            }
        }
        return -1;
    }
}