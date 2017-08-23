package maxCounters;

import java.util.Arrays;

/**
 * Created by adaeng on 2017. 5. 14..
 */
public class Solution {
    public int[] solution(int N, int[] A){
        int[] array = new int[N];
        int[] tmp = A.clone();
        int max = 0;

        Arrays.sort(tmp);

        if(!(tmp[0] == tmp[A.length -1] && tmp[0] == N + 1)){
            for (int i = 0; i < A.length; i++){

                if(1 <= A[i] && A[i] <= N){
                    array[A[i] - 1]++;
                    if(max < array[A[i] -1]){
                        max = array[A[i] -1];
                    }

                }else{
                    for(int j = 0; j < N ; j++){
                        array[j] = max;
                    }
                }

            }
        }

        return array;
    }


    public static void main(String[] args){
        int[] A = {3,4,4,6,1,4,4};

        int[] b = new Solution().solution(5,A);

        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }

    }
}
