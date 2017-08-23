package fish;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by adaeng on 2017. 8. 22..
 */
public class Solution {
    public int solution(int[] A, int[] B) {
        int fishes = 0;
        Stack<Integer> downStream = new Stack<Integer>();

        for(int i = 0; i < A.length; i++){
            if(B[i] != 0){
                downStream.push(A[i]);
            }else{

                if(downStream.isEmpty()){
                    fishes++;
                }else {
                    while (!downStream.isEmpty()){
                        if(A[i] > downStream.peek()) {
                            downStream.pop();
                        }
                        else {
                            break;
                        }

                        if(downStream.isEmpty()){
                            fishes += 1;
                            break;
                        }
                    }

                }
            }
        }

        return fishes + downStream.size();
    }



}
