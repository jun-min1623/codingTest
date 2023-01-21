package backjoon_Java;

import junit.framework.TestCase;
import main.Lv1_kakaoblind_report;
import main.Main;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class Silver_10828Test{
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void popTest() {
        Silver_10828.Main.stack s = new Silver_10828.Main.stack(3);
        s.push("1");
        s.push("2");
        s.push("3");
        s.pop();
        assertEquals("3\n", outContent.toString());
    }
}