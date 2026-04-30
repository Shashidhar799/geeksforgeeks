// User function Template for Java

class Sol {
    int[] count(String s) {
        // your code here
        int lc=0;
        int uc=0;
        int sc=0;
        int nv=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z'){
                uc++;
            }
            else if(ch>='a' && ch<='z'){
                lc++;
            }
            else if(ch>='0' && ch<='9'){
                nv++;
            }
            else{
                sc++;
            }
        }
        return new int[]{uc,lc,nv,sc};
    }
}