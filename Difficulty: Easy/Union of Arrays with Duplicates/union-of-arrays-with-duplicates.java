class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> result = new HashSet<>();
        for(int num:a){
            result.add(num);
        }
        for(int num:b){
            result.add(num);
        }
        ArrayList<Integer> list = new ArrayList<>(result);
        
        return list;
    }
}