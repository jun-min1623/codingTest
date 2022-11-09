package main;

import static org.junit.Assert.*;

import main.Lv1_newIdRecommend.Solution;
import org.junit.Test;

public class Lv1_newIdRecommendTest {
    @Test
    public void solution() {
        Solution solution = new Solution();
        String str = "...!@BaT#*..y.abcdefghijklm";
        assertEquals(solution.solution(str), "bat.y.abcdefghi");

    }

    @Test
    public void solution2() {
        Solution solution = new Solution();
        String str = "z-+.^.";
        assertEquals(solution.solution(str), "z--");
    }
    @Test
    public void solution3() {
        Solution solution = new Solution();
        String str = "-.~!@#$%&*()=+[{]}:?,<>/.-";
        assertEquals(solution.solution(str), "-.-");

    }

    @Test
    public void solution4() {
        Solution solution = new Solution();
        String str2 = ".ab......................c.";
        assertEquals(solution.solution(str2), "ab.c");
    } @Test
    public void solution5() {
        Solution solution = new Solution();
        String str = "abcdefghijklmn.p";
        assertEquals(solution.solution(str), "abcdefghijklmn");
    }
}