class Solution {
    public static ArrayList<Integer> valueEqualToIndex(int[] arr) {
        // code here
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==(i+1)){
                arr1.add(i+1);
            }
        }
        return arr1;
    }
}
