package permMissingElem;

import java.util.HashMap;

/**
 * Created by adaeng on 2017. 5. 12..
 */
public class Solution {

    public int solution(int[] A){

        int missingNum = 0;

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0; i < A.length; i++){
            map.put(A[i],A[i]);
        }

        for(int i = 1; i <= A.length + 1; i++){
            if(!map.containsKey(i)){
                missingNum = i;
            }
        }


        return missingNum;
    }


}
