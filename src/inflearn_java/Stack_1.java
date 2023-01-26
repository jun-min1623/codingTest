package inflearn_java;

import java.util.Scanner;
import java.util.Stack;

public class Stack_1 {
    public static String Solution(String str) {
        String ans = "YES";
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
                continue;
            }
            if (stack.isEmpty()) return "NO";
            stack.pop();
        }
        if (!stack.isEmpty()) return "NO";

        return ans;
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
