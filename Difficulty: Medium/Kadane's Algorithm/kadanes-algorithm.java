class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for(int i:arr){
            sum+=i;
            if(sum>maxsum){
                maxsum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxsum;
    }
}
