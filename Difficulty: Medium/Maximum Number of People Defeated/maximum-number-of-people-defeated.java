class Solution {
    int maxPeopleDefeated(int p) {
        // code here
        int count=0;
        for(int i=1;i<=Math.pow(p,2);i++){
            if(p>=Math.pow(i,2)){
                p-=Math.pow(i,2);
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
};