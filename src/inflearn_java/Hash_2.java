package inflearn_java;

import java.util.HashMap;
import java.util.Scanner;

public class Hash_2 {
    public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String input1 = in.nextLine();
            String input2 = in.nextLine();
            HashMap<Character, Integer> map = new HashMap<>();
            for (char c:input1.toCharArray()) {
                map.put(c, map.getOrDefault(c,0)+1);
            }


            System.out.println(input1 + input2);
            return;
        }
    }
}
