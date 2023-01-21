package backjoon_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_2559 {
    static int[] array;
    static int result;

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        // set first array
        array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = Integer.parseInt(st.nextToken());
        }
        result = 0;
        for(int i=0;i<n-k+1;i++){
            int sum =0;
            for(int j=i;j<i+k;j++){
                sum += array[j];
            }
            result = Math.max(result,sum);
        }
        System.out.println(result);
    }

}
