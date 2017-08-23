package frogRiverOne;

import java.util.HashMap;

/**
 * Created by adaeng on 2017. 5. 12..
 */
public class Solution {
    public int solution(int X, int[] A){
        int time = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        int check = 0;


        for(int i = 0; i < A.length; i++){

            if(!hashMap.containsKey(A[i])){
                hashMap.put(A[i],A[i]);
                check = check + 1;
                if(check == X){
                    break;
                }
            }

            time = time + 1;

            if(i == A.length - 1){
                time = -1;
            }
        }

        return time;
    }

}
