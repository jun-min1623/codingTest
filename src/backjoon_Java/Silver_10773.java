package backjoon_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Silver_10773 {
    public class Main{
        public static BufferedReader br;
        public static void main(String[] args) throws IOException {
            solution();
        }
        public static void solution() throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
            // 명령의 수 입력받음
            int n = Integer.parseInt(br.readLine());
            Stack<Integer> stack = new Stack<>();
            for (int i=0;i<n;i++){
                int num = Integer.parseInt(br.readLine());
                if(num!=0){
                    stack.push(num);
                }else {
                    stack.pop();
                }
            }
            int sum = 0;
            for (int a:stack
                 ) {
                sum+=a;
            }
            System.out.println(sum);
        }
    }
}
