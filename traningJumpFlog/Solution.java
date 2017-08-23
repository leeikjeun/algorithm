package traningJumpFlog;

/**
 * Created by adaeng on 2017. 5. 12..
 */
public class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8

        double tmp = Y - X;
        int result = (int) Math.ceil(tmp / D);

        return result;
    }
}
