package permCheck;

import java.util.HashMap;

/**
 * Created by adaeng on 2017. 5. 12..
 */
public class Solution {
    public int solution(int[] A) {
        int flag = 1;
        // write your code in Java SE 8
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0; i < A.length; i++){
            map.put(A[i],A[i]);
        }

        for(int i = 1; i <= A.length; i++){
            if(!map.containsKey(i)){
                flag = 0;
            }
        }

        return flag;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] A = {4,1,2,3};
        System.out.println(solution.solution(A));
    }
}
