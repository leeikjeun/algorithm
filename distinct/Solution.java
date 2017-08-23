package distinct;

import java.util.Arrays;

/**
 * Created by adaeng on 2017. 5. 22..
 */
public class Solution {
    public int solution(int[] A){
        int count = 0;

        if(A.length != 0) {
            Arrays.sort(A);
            int check = A[0];
            int compare = A[0];
            count = 1;
            for(int i = 0; i < A.length; i++){
                compare = A[i];

                if(check != compare){
                    check = A[i];
                    count++;
                }

            }
        }

        return count;
    }
}
