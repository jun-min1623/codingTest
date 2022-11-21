package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Softeer_pro3 {
    static int[] dp;
    static HashMap<Integer,Integer> Jmp;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //칸과 점프칸 갯수 입력
        String[] input = br.readLine().split(" ");
        int block_num = Integer.parseInt(input[0]);
        int jump_num = Integer.parseInt(input[1]);
        Jmp = new HashMap<>();
        dp = new int[block_num+1];
        for(int i=0;i<jump_num;i++){
            String[] temp = br.readLine().split(" ");
            int start = Integer.parseInt(temp[0]);
            int end = Integer.parseInt(temp[1]);
            Jmp.put(start,end);
        }
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<block_num;i++){
            int temp = i/6;
            if(temp>0){
                dp[i]= dp[i-6]+1;
            }else {
                dp[i] = dp[temp]+1;
            }
        }
        Iterator<Integer> keys = Jmp.keySet().iterator();
        while(keys.hasNext()){
            int key = keys.next();
            // dp[Jmp.get(key)] = 뛰어간 후 값, dp[key] 뛰기 전 값
            dp[Jmp.get(key)] = Math.min(dp[Jmp.get(key)],dp[key]);
        }
        for(int i=7;i<block_num-6;i++){
            for(int j=1;j<7;j++){
                dp[i+j] = Math.min(dp[i]+1,dp[i+j]);
            }
        }
        System.out.println(dp[block_num-1]);
    }
}
