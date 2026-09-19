class Solution {
    public boolean isPalinSent(String s) {
        // code here
        int n=s.length();
                int l=0;
                int r=n-1;
                while(l<r){
                    char left=s.charAt(l);
                    char right=s.charAt(r);
                    if(!isAlphaNumeric(left)){
                        l++;
                    }
                    else if(!isAlphaNumeric(right)){
                        r--;
                    }
                    else{
                        if(Character.toLowerCase(left)!=Character.toLowerCase(right)){
                            return false;
                        }
                        l++;
                        r--;
                    }
                }
                return true;
            }
            private static boolean isAlphaNumeric(char c){
                if((c>='a' && c<='z') ||
                    (c>='0' && c<='9') ||
                    (c>='A' && c<='Z')){
                        return true;
                    }
                return false;
            }
    
}