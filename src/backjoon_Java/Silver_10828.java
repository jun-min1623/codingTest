package backjoon_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 명령은 총 다섯 가지이다.

push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
입력
첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
* 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
*
*
* */
public class Silver_10828 {
    public class Main {
        public static class stack {
            int top;
            int size;
            int[] stack;

            public stack(int size) {
                this.size = size;
                stack = new int[size];
                top = -1;
            }

            public void push(String e) {
                top++;
                this.stack[top] = Integer.parseInt(e);
            }

            public void pop() {
                if (isEmpty()) {
                    System.out.println("-1");
                    return;
                }
                System.out.println(this.stack[top]);
                top--;
            }
            public boolean isEmpty() {
                if (top == -1) {
                    return true;
                }
                return false;
            }

            public void getSize() {
                System.out.println(top+1);
            }

            public void top() {
                if (isEmpty()) {
                    System.out.println("-1");
                    return;
                }
                System.out.println(stack[top]);
            }
        }

        public static BufferedReader br;

        public static void main(String[] args) throws IOException {
            solution();
        }

        public static void solution() throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
            // 명령의 수 입력받음
            int n = Integer.parseInt(br.readLine());
            stack stack = new stack(n);
            for (int i=0;i<n;i++){
                String str = br.readLine();
                execute(stack, str);
            }
        }

        public static void execute(stack stk, String command) {
            String[] cmd = command.split(" ");
            String execution = cmd[0];
            if (execution.equals("push")) {
                stk.push(cmd[1]);
            }
            if (execution.equals("pop")) {
                stk.pop();
            }
            if (execution.equals("size")) {
                stk.getSize();
            }
            if (execution.equals("empty")){
                if(stk.isEmpty()) System.out.println("1");
                else System.out.println("0");
            }
            if(execution.equals("top")){
                stk.top();
            }

        }


    }

}
