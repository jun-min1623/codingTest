package inflearn_java;

import static org.junit.Assert.*;

import inflearn_java.problem1_1.*;
import main.Main;
import org.junit.Test;

public class problem1_1Test {

    @Test
    public void main() {
        problem1_1 problem1_1 = new problem1_1();

        String com = "Computercooler";
        char c = 'c';
        assertEquals(problem1_1.main(com,c),2);


    }

    @Test
    public void solution() {

    }


}