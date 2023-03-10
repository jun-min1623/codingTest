package backjoon_Java;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Silver_11047Test {
    @Test
    public void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] listint = {1,5,10,50,100,500,1000,5000,10000,50000};
        List<Integer> list = new ArrayList<>();
        for (int i : listint) {
            list.add(i);
        }
        int ans = Silver_11047.Main.solution(10,4200,list);
        assertEquals(ans,6);
    }

}