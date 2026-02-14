class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> leader = new ArrayList<>();
        int n = arr.length;

        int maxFromRight = arr[n - 1];
        leader.add(maxFromRight);   
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                leader.add(arr[i]);
            }
        }
        Collections.reverse(leader);
        return leader;
    }
}
