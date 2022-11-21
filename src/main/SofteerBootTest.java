package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SofteerBootTest {

    public static void main(String[] args) throws Exception {
        class num_colored{
            private int num;
            private boolean colored;
        }
        class rectangle{
            private num_colored blocks;
            public rectangle(){

            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String level = input[0];
        int block_num = Integer.parseInt(input[1]);
        String[] last_block_colored = input[2].split(",");
        List<Integer[]> total = new ArrayList<>();
        for(int i=0;i<block_num;i++){
            for (int j=0;j<block_num;j++){

            }
        }
    }
}
