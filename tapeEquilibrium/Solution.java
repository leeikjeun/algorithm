package tapeEquilibrium;

/**
 * Created by adaeng on 2017. 5. 12..
 */
public class Solution {
    public int solution(int[] A){
        int tmpNum = 0;
        int sumVal = 0;
        int tmp;
        int firstNode = A[0];

        for(int i = 1; i < A.length; i++){
            sumVal += A[i];
        }

        tmpNum = firstNode - sumVal;

        if(tmpNum < 0)
            tmpNum = tmpNum * -1;

        for(int i = 1; i < A.length; i++){
            tmp = firstNode - sumVal;

            sumVal = sumVal - A[i];
            firstNode = firstNode + A[i];

            if(tmp < 0){
                tmp = tmp * -1;
            }

            if(tmp < tmpNum)
                tmpNum = tmp;
        }

        return tmpNum;
    }

    public static void main(String[] args){
        Solution solution = new Solution();

        int[] A = {3,1,2,4,3};
        System.out.println(solution.solution(A));
    }
}
