package inflearn_java;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem1_3Test {

    @Test
    public void test_main() {
        Problem1_3 problem1_3 = new Problem1_3();
        String str1 = "it is time to study";
        String[] str = str1.split(" ");
        assertEquals(problem1_3.Test_main(str),"study");

    }
}