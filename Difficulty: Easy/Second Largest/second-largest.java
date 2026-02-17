import java.util.*;
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        if(arr==null || arr.length<2){
            return -1;
        }
        int largest=-1;
        int secondLargest=-1;
        for(int num : arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }else if(num<largest && num>secondLargest){
                secondLargest=num;
            }
        }
        return secondLargest;
    }
}