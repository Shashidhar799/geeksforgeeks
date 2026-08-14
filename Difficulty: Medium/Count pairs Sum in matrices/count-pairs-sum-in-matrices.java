class Solution {
    int countPairs(int[][] mat1, int[][] mat2, int x) {
        // code here
        int count=0;
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[0].length;j++){
                int target= x-mat1[i][j];
                
                if(binarySearch(mat2,target)){
                    count++;
                }
            }
        }
        return count;
    }
    boolean binarySearch(int mat2[][],int target){
        int low=0;
        int high=(mat2.length*mat2.length)-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            int i=mid/mat2.length;
            int j=mid%mat2.length;
            
            if(mat2[i][j]==target) return true;
            else if(mat2[i][j]<target) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
}