package main;

import static org.junit.Assert.*;

import main.Lv1_yenyangPlus.Solution;
import org.junit.Test;

public class Lv1_yenyangPlusTest {
    @Test
    public void solution(){
        Solution solution = new Solution();
        int[] absolutes = {4,5,6};
        boolean[] signs = {true,false,true};
        assertEquals(solution.solution(absolutes,signs),5);
    }
}