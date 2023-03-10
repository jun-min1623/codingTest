package backjoon_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Silver_11047 {
    public static class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());
            List<Integer> coinList = coinListMaker(n,br);
            System.out.println(solution(n,k,coinList));
        }
        public static List<Integer> coinListMaker(int n, BufferedReader br) throws IOException {
            List<Integer> value = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                value.add(Integer.parseInt(br.readLine()));
            }
            return value;
        }
        public static int solution(int n, int k,List<Integer> coinlist) throws IOException {
            int ansNum =0;
            int tempNum=0;
            // 1. 가장 후순위 친구부터 그리디
            for (int i = n-1; i >= 0 ; i--) {
                int val = coinlist.get(i);
                tempNum = (k /val);
                if(tempNum > 0) {
                    ansNum+=tempNum;
                    k = k%coinlist.get(i);
                }

            }
            return ansNum;
        }

    }
}
