package backjoon_Java.dfs;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.LinkOption;
import java.util.*;

public class Silver_24479 {

    public static class Main {
        // 코드 참고 안하고 혼자 짜보기!!!!!! (이론 ㄱㄴ)
        public static int results[];
        public static int sequence = 0;

        public static void main(String[] args) throws IOException {
            Stack<Integer> stack = new Stack<>();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            int N = Integer.parseInt(line.split(" ")[0]);
            int M = Integer.parseInt(line.split(" ")[1]);
            int R = Integer.parseInt(line.split(" ")[2]);
            Map<Integer, List<Integer>> graph = new HashMap<>(N + 1);
            boolean[] visited = new boolean[N + 1];
            Arrays.fill(visited, false);
            // 초기 설정
            stack.push(R);
            results = new int[N + 1];
            //visited[R] = true;
            while (M-- > 0) {
                String[] uv = br.readLine().split(" ");
                int u = Integer.parseInt(uv[0]);
                int v = Integer.parseInt(uv[1]);
                List<Integer> newV = new ArrayList<>();
                List<Integer> newU = new ArrayList<>();
                if (!(graph.get(u) == null)) {
                    newV = graph.get(u);
                }
                if (!(graph.get(v) == null)) {
                    newU = graph.get(v);
                }
                newV.add(v);
                newU.add(u);
                graph.put(u, newV);
                graph.put(v, newU);
            }
            //
            for (List<Integer> eachEdge : graph.values()) {
                Collections.sort(eachEdge,Comparator.reverseOrder());
            }
            runDFS(graph, visited, stack);

            for (int i = 1; i < results.length; i++) {
                System.out.println(results[i]);
            }

        }

        public static void runDFS(Map<Integer, List<Integer>> graph, boolean[] visited, Stack<Integer> stack) {
            while (!stack.isEmpty()) {
                int stackNodeIdx = stack.pop();
                if(visited[stackNodeIdx]) continue;
                visited[stackNodeIdx] = true;
                results[++sequence] = stackNodeIdx;
                for (int child : graph.get(stackNodeIdx)) {
                    // 방문 체크 후 안했으면 스택에 넣은 후 방문처리
                    if (!visited[child]) {
                        stack.push(child);
                    }
                }

            }

        }
    }
}
