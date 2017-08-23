package minAvgTwoSlice;

/**
 * Created by adaeng on 2017. 5. 22..
 */
public class Solution {

    public int solution(int[] A){

        int min = 0;
        double avg = ((double) A[0] + (double) A[1]) / 2;

        for(int i = 1; i < A.length; i++){
            if(avg > ((double) A[i-1] + (double) A[i]) / 2){
                avg = ((double) A[i-1] + (double) A[i]) / 2;
                min = i - 1;
            }
        }

        for(int i = 2; i < A.length; i++){
            if(avg > ((double) A[i-2] + (double) A[i-1] + (double) A[i]) / 3){
                avg = ((double) A[i-2] + (double) A[i-1] + (double) A[i]) / 3;
                min = i - 2;
            }
        }

        return min;
    }


}
