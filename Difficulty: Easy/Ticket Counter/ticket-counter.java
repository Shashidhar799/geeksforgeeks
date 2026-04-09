class Solution {
    public static int distributeTicket(int n, int k) {
        // code here
        boolean flag=true;
        int f=1;
        int r=n;
        while(f<=r){
            if(flag){
                if(f+k-1>=r) 
                    return r;
                f=f+k;
            }
            else{
                if(r-k+1<=f) 
                    return f;
                r=r-k;
            }
            flag=!flag;
        }
        return 0;
    }
}