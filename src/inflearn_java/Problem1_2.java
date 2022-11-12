package inflearn_java;

import java.util.Scanner;

public class Problem1_2 {
    public static String Solution(String str){
        String ans="";

        for (char c:str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                ans+=Character.toUpperCase(c);
            } else {
                ans+=Character.toLowerCase(c);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        System.out.println(Solution(input1));
        return;
    }
    public String Test_main(String str){
        Problem1_2 problem1_2 = new Problem1_2();
        return problem1_2.Solution(str);
    }

}
