class Solution {
    public List<Integer> exitPoint(int[][] mat) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int dir=0;
        int i=0,j=0;
        int r=mat.length;
        int c=mat[1].length;
        while(i>=0 && i<r && j>=0 && j<c){
            if(mat[i][j]==1){
                mat[i][j]=0;
                dir=(dir+1)%4;
            }
            if(dir==0) j++;
            else if(dir==1) i++;
            else if(dir==2) j--;
            else if(dir==3) i--;
        }
        if(dir==0) j--;
        else if(dir==1) i--;
        else if(dir==2) j++;
        else if(dir==3) i++;
        
        result.add(i);
        result.add(j);
        
        return result;
    }
}