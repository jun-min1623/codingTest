package main;

import static org.junit.Assert.*;

import main.Lv1_kakaoblind_report.Solution;
import org.junit.Test;

public class Lv1_kakaoblind_reportTest {
    @Test
    public void solution(){
        Solution solution = new Solution();
        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;
        int[] result = {0,0};

        assertArrayEquals(solution.solution(id_list,report,k), result);

    }

}