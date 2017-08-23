package missingInteger;


import java.util.Arrays;

/**
 * Created by adaeng on 2017. 5. 14..
 */

public class Solution {
    public int solution(int[] A) {
        int missingNum = 1;
        Arrays.sort(A);
        int overlapNum = 0;

        for(int i = 0; i < A.length; i++){
            int tmpNum = A[i];

            if(tmpNum > 0){
                if(tmpNum != overlapNum){
                    if(tmpNum == missingNum){
                        missingNum++;
                        overlapNum = tmpNum;
                    }else{
                        break;
                    }
                }
            }
        }

        return missingNum;
    }

    public static void main(String[] args) {
        int[] A = {1,3,6,4,1,2};
        System.out.println(new Solution().solution(A));
    }
}
