package inflearn_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// 해쉬맵 연습문제 1
public class Hash_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int studentNum = in.nextInt();
        String studentListStr = in.next();
        Map<Character, Integer> studentMap = new HashMap<>();
        for (char student : studentListStr.toCharArray()) {
            studentMap.put(student,studentMap.getOrDefault(student,0)+1);
        }
        int max_num = Integer.MIN_VALUE;
        char ansKey = 0;
        for (char key : studentMap.keySet()){
            if(studentMap.get(key)>max_num){
                max_num = studentMap.get(key);
                ansKey = key;
            }
        }
        //int x = studentMap.get(ansKey);
        System.out.println(ansKey);
        return;
    }

}
