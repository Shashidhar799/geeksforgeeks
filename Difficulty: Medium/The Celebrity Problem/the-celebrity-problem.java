class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n=mat.length;
        Stack<Integer> st = new Stack<>();
        //Step-1:Push all people
        for(int i=0;i<n;i++){
            st.push(i);
        }
        //Step-2:Eliminate non-celebrities
        while(st.size()>1){
            int a=st.pop();
            int b=st.pop();
            if(mat[a][b]==1){
                st.push(b);
            }else{
                st.push(a);
            }
        }
        //Step-3:Validate the candidate
        //condition 1:celebrity does't know anyone
        //condition 2:Every one knows he celebrity
        int candidate=st.pop();
        for(int i=0;i<n;i++){
            if(i!=candidate){
                if(mat[candidate][i]==1 || mat[i][candidate]==0){
                    return -1;
                }
            }
        }
        return candidate;
    }
}