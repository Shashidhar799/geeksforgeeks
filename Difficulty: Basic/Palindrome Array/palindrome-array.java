
class Solution {
    public static boolean isPerfect(int[] arr) {
        // code here
        boolean flag=true;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[n-1-i]){
                flag=false;
            }
        }
        return flag;
    }
}
