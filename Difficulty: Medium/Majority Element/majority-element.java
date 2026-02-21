class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n=arr.length;
        int fre=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(fre==0){
                ans=arr[i];
            }
            if(ans==arr[i]){
                fre++;
            }
            else{
                fre--;
            }
        }
        int count=0;
        for(int val:arr){
            if(val==ans){
                count++;
            }
        }
        if(count>n/2){
            return ans;
        }
        return -1;
    }
}