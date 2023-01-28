package backjoon_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Silver_1874 {
    public static class Main {
        public static BufferedReader br;
        public static void main(String[] args) throws IOException {
            solution();
        }

        public static void solution() throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
            // 진행하려는 스택 수
            int n = Integer.parseInt(br.readLine());
            Stack<Integer> stack = new Stack<>();
            StringBuilder sb = new StringBuilder();
            int cnt = 1;
            boolean noFlag=false;
            // 수가 1부터 시작
            for (int i = 0; i < n; i++) {
                // 첫 숫자가 4일때 해보기.
                if(noFlag) break;
                int num = Integer.parseInt(br.readLine());
                while (true) {
                    if (stack.isEmpty()) {
                        stack.push(cnt);
                        cnt++;
                        sb.append("+").append("\n");
                    }
                    if (stack.peek() == num) {
                        stack.pop();
                        sb.append("-").append("\n");
                        break;
                    }else if(stack.peek()>num){
                        sb = new StringBuilder();
                        sb.append("NO");
                        noFlag=true;
                        break;

                    }
                    else {
                        stack.push(cnt);
                        cnt++;
                        sb.append("+").append("\n");
                    }
                }

            }
            sb.toString();
            System.out.print(sb.toString());

        }
    }

}
