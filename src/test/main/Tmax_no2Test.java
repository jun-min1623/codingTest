package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tmax_no2Test {

    @Test
    public void tmax_no2() {
        Tmax_no2 tmax_no2 = new Tmax_no2();
        int[] bal = {30,30,30,30};
        int[][] trans = {{1,2,10},{2,3,20},{3,4,5},{3,4,30}};
        int[] abn = {1};
        int[] res = {0,20,15,55};
        assertArrayEquals(tmax_no2.tmax_no2(bal,trans,abn),res);

    }
}