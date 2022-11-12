package inflearn_java;

import java.util.Scanner;

public class Problem1_4 {

    public static String[] Solution(String[] str,int n){
        String[] ans= new String[n];
        for (int i=0;i<n;i++) {
            ans[i] = new StringBuilder(str[i]).reverse().toString();
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String[] input = new String[n];
        for(int i=0;i<n;i++){
             input[i]= in.next();
        };
        String[] res = (Solution(input,n));
        for(String s : res){
            System.out.println(s);
        }
        return;
    }
    public String[] Test_main(String[] str, int n){
        Problem1_4 problem1_4 = new Problem1_4();
        return problem1_4.Solution(str,n);
    }
}
