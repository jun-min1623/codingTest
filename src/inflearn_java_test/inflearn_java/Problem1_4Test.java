package inflearn_java;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem1_4Test {

    @Test
    public void test_main() {
        Problem1_4 problem1_4 = new Problem1_4();
        int n =3;
        String[] str = {"asdf","aabb","ccdd"};
        String[] res = {"fdsa","bbaa","ddcc"};
        assertEquals(problem1_4.Test_main(str,n),res);
    }
}