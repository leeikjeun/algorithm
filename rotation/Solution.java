package rotation;

/**
 * Created by adaeng on 2017. 3. 22..
 */
public class Solution {

    public int[] solution(int[] A, int K){
        int[] cope = new int[A.length];
        int index = 0;
        if(A.length != 0){
            if (A.length > K) {

                for (int i = A.length - K; i < A.length; i++) {
                    cope[index] = A[i];
                    index++;
                }

                for (int i = 0; i < A.length - K; i++) {
                    cope[index] = A[i];
                    index++;
                }
            }else if (A.length == K){
                cope = A;
            }else {
                while (true) {
                    K = K - A.length;
                    if (A.length > K)
                        break;
                }
                for (int i = A.length - K; i < A.length; i++) {
                    cope[index] = A[i];
                    index++;
                }

                for (int i = 0; i < A.length - K; i++) {
                    cope[index] = A[i];
                    index++;
                }
            }
        }

        return cope;
    }
}
