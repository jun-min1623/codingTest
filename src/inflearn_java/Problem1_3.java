package inflearn_java;

import java.util.Scanner;

public class Problem1_3 {
    public static String Solution(String[] str){
        String ans=str[0];
        for (String s:str) {
            if (s.length()>ans.length()) {
                ans=s;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String[] input1 = in.nextLine().split(" ");
        System.out.println(Solution(input1));
        return;
    }
    public String Test_main(String[] str){
        Problem1_3 problem1_3 = new Problem1_3();
        return problem1_3.Solution(str);
    }

}
