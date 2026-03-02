import java.util.*;
class Solution {
    public String longest(List<String> arr) {
        // code here
        int max=0;
        int n=arr.size();
        String ans="";
        for(int i=0;i<n;i++){
            String s=arr.get(i);
            int l=s.length();
            if(l>max){
                max=l;
            }
        }
        for(int i=0;i<n;i++){
            if((arr.get(i)).length()==max){
                ans=arr.get(i);
                break;
            }
        }
        return ans;
    }
}
