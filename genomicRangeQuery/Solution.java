package genomicRangeQuery;


import java.util.Arrays;

/**
 * Created by adaeng on 2017. 5. 16..
 */


public class Solution {
    public int[] solution(String S, int[] P, int[] Q){
        int[] result = new int[P.length];

        int[] A = new int[S.length() + 1];
        int[] C = new int[S.length() + 1];
        int[] G = new int[S.length() + 1];

        for(int i = 0; i < S.length(); i++){
            A[i + 1] = A[i] + (S.charAt(i) == 'A' ? 1 : 0);
            C[i + 1] = C[i] + (S.charAt(i) == 'C' ? 1 : 0);
            G[i + 1] = G[i] + (S.charAt(i) == 'G' ? 1 : 0);
        }

        for(int i = 0; i < P.length; i++){
            int a = A[Q[i] + 1] - A[P[i]];
            int c = C[Q[i] + 1] - C[P[i]];
            int g = G[Q[i] + 1] - G[P[i]];
            result[i] = a > 0 ? 1 : c > 0 ? 2 : g > 0 ? 3 : 4;
        }

        return result;
    }

    public static void main(String[] args){
        int[] A = {2, 5, 0};
        int[] B = {4, 5, 6};
        int[] test = new Solution().solution("CAGCCTA",A,B);
        for(int i : test){
            System.out.println(i);
        }
    }
}
