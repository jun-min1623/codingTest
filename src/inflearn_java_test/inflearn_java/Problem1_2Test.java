package inflearn_java;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem1_2Test {

    @Test
    public void test_main() {
        Problem1_2 problem1_2 = new Problem1_2();
        String str = "STUDY";
        assertEquals(problem1_2.Test_main(str),"study");
    }
}