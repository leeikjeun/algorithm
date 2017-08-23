package triangle;

import java.util.Arrays;

/**
 * Created by adaeng on 2017. 5. 22..
 */

public class Solution {
    public int solution(int[] A){

        Arrays.sort(A);

        int check = 0;

        if(A.length > 3){
            for(int i = 0; i < A.length - 2; i++){
                if(A[i] >=0 && A[i] > A[i+2] - A[i+1]){
                    check = 1;
                }
            }
        }

        return check;

    }

    public static void main(String[] args){
        int[] test = {10,2,5,1,8,20};
        System.out.print(new Solution().solution(test));
    }



}
