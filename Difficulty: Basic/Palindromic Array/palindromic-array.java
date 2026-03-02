/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        int n=arr.length;
        for(int num:arr){
            if(num<0) return false;
            if(num%10==0 && num!=0) return false;
            int temp=num;
            int s=0;
            while(temp>0){
                s=s*10+(temp%10);
                temp/=10;
            }
            if(s!=num){
                return false;
            }
        }
        return true;
    }
}