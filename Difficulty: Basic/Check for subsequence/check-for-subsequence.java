// User function Template for Java

class Solution {
    boolean isSubSequence(String A, String B) {
        int m=A.length();
        int n=B.length();
        int i=0;
        int j=0;
        
        while(i<m && j<n){
            if(A.charAt(i)==B.charAt(j)){
                i++;
            }
            j++;
        }
        return i==m;
    }
}