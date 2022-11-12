package inflearn_java;

import java.util.Scanner;

public class problem1_1 {
    public static int solution(String str,char t){
        int answer=0;
        str = str.toUpperCase();
        t=Character.toUpperCase(t);
        for(int i=0; i<str.length();i++){
            if(str.charAt(i) == t){
                answer++;
            }
        }
        return answer;
    }
    public long main(String args, Character a){
        String str;
        char c;
        if(args.length()>0){
            str = args;
            c = a;
        }else{

            Scanner in=new Scanner(System.in);
            str = in.next();
            c = in.next().charAt(0);
        }

        System.out.print(solution(str,c));
        return solution(str,c);
    }
}
