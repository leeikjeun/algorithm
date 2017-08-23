package samsungtest;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by adaeng on 2017. 6. 29..
 */
public class Main {

        public static void main(String args[]) throws Exception	{
            int count = 0;
            int max = 0;
            Scanner sc = new Scanner(System.in);

            Stack<Character> stack = new Stack<Character>();
            int T = sc.nextInt();
            sc.nextLine();
            for(int test_case = 0; test_case < T; test_case++) {
                String string = sc.nextLine();
                char[] stringArray = string.toCharArray();

                for(int i = 0; i < stringArray.length; i++){

                    if(stringArray[i] == '(' || stringArray[i] == '{' || stringArray[i] == '['){
                        stack.push(stringArray[i]);
                    }else {
                        if(!stack.isEmpty()){
                            char tmp = stack.pop();
                            if(tmp == '(' && stringArray[i] == ')'){
                                count = count + 2;
                                if(stack.empty()){
                                    if(count > max){
                                        max = count;
                                    }
                                    count = 0;
                                }
                            }else if(tmp == '{' && stringArray[i] == '}'){
                                count = count + 2;
                                if(stack.empty()){
                                    if(count > max){
                                        max = count;
                                    }
                                    count = 0;
                                }
                            }else if(tmp == '[' && stringArray[i] == ']'){
                                count = count + 2;
                                if(stack.empty()){
                                    if(count > max){
                                        max = count;
                                    }
                                    count = 0;
                                }
                            }else {
                                stack.clear();
                            }

                        }

                    }

                }

                stack.clear();
                System.out.println("Case #"+(test_case+1));
                System.out.println(max);
                count = 0;
                max = 0;

            }
        }

    }



