package brackets;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by adaeng on 2017. 5. 26..
 */
public class Solution {
    public int solution(String S){
        int can = 0;
        char[] cherlist = S.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        if(cherlist.length % 2 == 0){
            for (int i = 0; i < cherlist.length; i++){
                try {
                    switch (cherlist[i]){
                        case '(':
                            stack.push(cherlist[i]);
                            System.out.println("푸쉬 " + cherlist[i] + " ");
                            break;
                        case '{':
                            stack.push(cherlist[i]);
                            System.out.println("푸쉬 " + cherlist[i] + " ");
                            break;
                        case '[':
                            stack.push(cherlist[i]);
                            System.out.println("푸쉬 " + cherlist[i] + " ");
                            break;
                        case ')':
                            if(stack.peek() == '(')
                                stack.pop();
                            System.out.println("stack pop " + cherlist[i]);
                            break;
                        case '}':
                            if(stack.peek() == '{')
                                stack.pop();
                            System.out.println("stack pop " + cherlist[i]);
                            break;
                        case ']':
                            if(stack.peek() == '[')
                                stack.pop();
                            System.out.println("stack pop " + cherlist[i]);
                            break;
                    }
                }catch (EmptyStackException e){
                    can = 0;
                }catch (NullPointerException e){
                    can = 0;
                }
            }

            if (stack.isEmpty())
                can = 1;
        }




        return can;

    }

    public static void main(String[] args){
        System.out.println(new Solution().solution("{[()()]}"));
    }
}
