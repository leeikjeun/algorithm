package binarygap;

/**
 * Created by adaeng on 2017. 3. 21..
 */
public class Solution {


    public int solution(int N){
        int flag = 0;
        int save = 0;
        int lastCount = 0;
        while (true){

            if(N % 2 == 1) {
                if(flag == 0){
                    flag = 1;
                }else{
                    if(lastCount > save)
                        save = lastCount;
                    lastCount = 0;
                }
            }else{
                if (flag != 0)
                    lastCount++;
            }

            N = N / 2;

            if(N == 0)
                break;

        }
        return save;
    }
    public static void main(String[] args){
        Solution test = new Solution();
        System.out.println(test.solution(1043));

    }
}
