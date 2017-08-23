package countDiv;

/**
 * Created by adaeng on 2017. 5. 16..
 */
public class Solution {
    public int solution(int A, int B, int K){

        int divB;
        int divA;
        int result;

        divA = A / K;

        if(A % K == 0)
            divA = divA - 1;

        divB = B / K;

        result = divB - divA;

        return result;
    }


    public static void main(String[] args){

        System.out.println(new Solution().solution(11,347, 17));

    }
}
