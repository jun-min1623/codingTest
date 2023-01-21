package backjoon_Java;

import junit.framework.TestCase;
import main.Lv1_kakaoblind_report;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertArrayEquals;

public class Silver_10828Test extends TestCase {
    @Test
    public void testPush() {
        Silver_10828.Main.stack stack = new Silver_10828.Main().new stack(5);
        stack.push("5");
        stack.push("10");
        stack.push("15");

        assertArrayEquals(new int[] {5, 10, 15,0,0}, stack.stack);
    }



}