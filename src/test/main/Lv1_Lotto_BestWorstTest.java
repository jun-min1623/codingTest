package main;

import static org.junit.Assert.*;

import main.Lv1_Lotto_BestWorst.*;
import org.junit.Test;

public class Lv1_Lotto_BestWorstTest {

    @Test
    public void solution() {
        Lv1_Lotto_BestWorst lv1_lotto_bestWorst = new Lv1_Lotto_BestWorst();
        int[] lottos = {44,1,0,0,31,25};
        int[] win_nums = {31,10,45,1,6,19};
        int[] result = {3,5};
        assertArrayEquals(lv1_lotto_bestWorst.solution(lottos,win_nums), result);
    }
}