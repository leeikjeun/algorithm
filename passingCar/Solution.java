package passingCar;

/**
 * Created by adaeng on 2017. 5. 21..
 */
public class Solution {

    public int solution(int[] A) {
        long passing = 0, howmany = 0;

        for(int i = 0; i < A.length; i++){

            if(A[i] == 0)
                passing++;
            else
                howmany += passing;

        }

        if(howmany > 1000000000)
            howmany = (-1);

        return (int) howmany;
    }



}
