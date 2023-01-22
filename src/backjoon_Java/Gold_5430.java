package backjoon_Java;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/*첫째 줄에 테스트 케이스의 개수 T가 주어진다. T는 최대 100이다.

각 테스트 케이스의 첫째 줄에는 수행할 함수 p가 주어진다. p의 길이는 1보다 크거나 같고, 100,000보다 작거나 같다.

다음 줄에는 배열에 들어있는 수의 개수 n이 주어진다. (0 ≤ n ≤ 100,000)

다음 줄에는 [x1,...,xn]과 같은 형태로 배열에 들어있는 정수가 주어진다. (1 ≤ xi ≤ 100)

전체 테스트 케이스에 주어지는 p의 길이의 합과 n의 합은 70만을 넘지 않는다.
 *
 * */
public class Gold_5430 {

    public static class Main {
        public static void main(String[] args) throws IOException {
            solution();
        }

        public static void solution() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            // 명령의 수 입력받음
            int T = Integer.parseInt(br.readLine());
            for (int i = 0; i < T; i++) {
                try {
                    runEachTestCases(br);
                } catch (NumberFormatException e) {
                    bw.write("error\n");
                    return;
                }
            }
        }

        public static void runEachTestCases(BufferedReader br) throws NumberFormatException, IOException {
            /* 한번의 케이스에 3가지 행동을 한다.
            1. RDD 마냥 행동 받기
            2. 배열 size 받기
            3. 배열 elements 받기.
            행동이 끝나면, 1번 실행. 그후 실행 결과를 출력.
             */
            // 1~3 번
            String[] actions = br.readLine().split("");
            int size = Integer.parseInt(br.readLine());
            if (size == 0 && size < actions.length) {
                System.out.println("error");
                return;
            }
            String elementUnparsed = br.readLine();
            elementUnparsed = elementUnparsed.replaceAll("]", "");
            elementUnparsed = elementUnparsed.replaceAll("\\[", "");
            String[] resString = new String[size];
            if (size == 1) {
                resString[0] = elementUnparsed;
            } else {
                resString = elementUnparsed.split(",");
            }
            int[] res = new int[resString.length];
            for (int i = 0; i < resString.length; i++) {
                res[i] = Integer.parseInt(resString[i]);
            }
            int[] elementParsed = res.clone();

            // 덱 시작, 값들 넣기
            Deque<Integer> deque = new ArrayDeque();
            // false 면 뒤, true 면 앞 가르킴
            boolean header = true;
            for (int str : elementParsed
            ) {
                deque.add(str);
            }
            if (deque.size() < actions.length) {
                System.out.println("error");
                return;
            }
            // 1번들 액션 실행
            for (String action : actions
            ) {
                if (action.equals("R")) {
                    header = !header;
                }
                if (action.equals("D")) {
                    deque = delete(deque, header);
                }
            }
            StringBuilder stringBuilder;
            if (header) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("[");
                size = deque.size();
                for (int i = 0; i < size; i++) {
                    stringBuilder.append(deque.pollFirst());
                    if ((i + 1) != size) stringBuilder.append(",");
                    //System.out.print(deque.pollLast());
                }
                stringBuilder.append("]");

                System.out.println(stringBuilder.toString());
//                System.out.println(deque);
            } else {
                size = deque.size();
                stringBuilder = new StringBuilder();
                stringBuilder.append("[");
                for (int i = 0; i < size; i++) {
                    stringBuilder.append(deque.pollLast());
                    if ((i + 1) != size) stringBuilder.append(",");
                    //System.out.print(deque.pollLast());
                }
                stringBuilder.append("]");

                System.out.println(stringBuilder.toString());
            }
        }

        public static Deque delete(Deque deque, boolean header) {
            if (header) {
                deque.pollFirst();
            } else deque.pollLast();
            return deque;
        }
    }
}

