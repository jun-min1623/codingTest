package inflearn_java;

import java.util.Scanner;
import java.util.Stack;

public class Stack_2 {
    public class Main{
        public static String Solution(String str) {
            String ans = "";
            Stack<Character> stack = new Stack<>();
            for (char c : str.toCharArray()) {
                // 여는 문자열이면 푸쉬 후 다음 문자열 대기.
                if (c == '(') {
                    stack.push(c);
                    continue;
                }
                // 만약 닫는 문자열이면 pop을 계속하다가
                if(c==')'){
                    while (!(stack.peek()=='(')){
                        stack.pop();
                    }
                    stack.pop();
                    continue;
                }
                stack.push(c);
            }
            for (char c:stack
                 ) {
                ans = c+ans;
            }
            StringBuffer stringBuffer = new StringBuffer(ans);
            String newans = stringBuffer.reverse().toString();
            return newans;
        }

        public static void main(String[] args) {
            // 제출용 main
            //Main T = new Main();
            Scanner in = new Scanner(System.in);
            String input1 = in.next();
            //System.out.println(T.Solution(input1));
            System.out.println(Solution(input1));
        }
    }
}
