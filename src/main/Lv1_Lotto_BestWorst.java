package main;

import java.util.Arrays;
import java.util.Collections;

public class Lv1_Lotto_BestWorst {
//    public Lv1_Lotto_BestWorst() {
//        int[] lottos = {1,2,3,4,5,6};
//        int[] win_nums = {5,6,7,8,9,10};
//        System.out.println(solution(lottos,win_nums));
//    }
    public static boolean contains(final int[] arr, final int key) {
    Arrays.sort(arr);
    return Arrays.binarySearch(arr, key) >= 0;
    }
    public int[] ret_winnums(int[] lottos, int[] win_nums){
        int win_cnt=0;
        int zero_cnt=0;
        int[] result = {0,0};
        Arrays.sort(win_nums);
        for (int num:lottos
             ) {
            boolean val = contains(win_nums,num);
            if(val){
                win_cnt++;
            } else if (num==0) {
                zero_cnt++;
            }
        }
        result[1] = 7-win_cnt;
        result[0] = 7-(win_cnt+zero_cnt);
        if(result[1]==7){
            result[1] = 6;
        }if(result[0]==7){
            result[0] = 6;
        }
        return result;
    }
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        answer = ret_winnums(lottos,win_nums);
        return answer;
    }
}
