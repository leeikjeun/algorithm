package odd_occurrences_In_array;

import java.util.HashMap;

/**
 * Created by adaeng on 2017. 3. 21..
 */
public class Solution {

    public int solution(int[] N){

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        int single = 0;
        for(int i=0; i < N.length ; i++){
                if (!map.containsKey(N[i])) {
                    map.put(N[i], N[i]);
                    single = N[i];
                }

        }

        return single;
    }

    public static void main(String[] args){
        int[] A = {6,3,2,2,3,6,9};
        System.out.println(new Solution().solution(A));

    }
}
