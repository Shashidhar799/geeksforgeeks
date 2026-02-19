// User function Template for Java

class Complete {

    // Function for finding maximum and value pair
    public static int[] game_with_number(int arr[], int n) {
        // Complete the function
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            if(i==(n-1)){
                res[i]=arr[i];
            }else{
                res[i]=(arr[i]^arr[i+1]);
            }
        }
        return res;
    }
}
