// User function Template for Java
class Solution {
    static ArrayList<Integer> getTable(int n) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<=10;i++){
            arr.add(i*n);
        }
        return arr;
    }
}