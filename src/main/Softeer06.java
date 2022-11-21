package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Softeer06 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] nums = new int[input.length];
        for (int i=0;i<input.length;i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(nums);
        int index = 0;
        int[] temp = {nums[1]-nums[0],index};
        for (int i=0;i<nums.length-1;i++) {
            int subs = nums[i+1]-nums[i];
            if(temp[0]>subs){
                index = i;
                temp[0] = subs;
                temp[1] = index;
            } else if (temp[0]==subs) {
                continue;
            }
        }
        System.out.println(nums[index]+" "+nums[index+1]);
    }

}
