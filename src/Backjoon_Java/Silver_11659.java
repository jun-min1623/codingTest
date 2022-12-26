package Backjoon_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_11659 {
    public static int Solution(){


        return 0;
    }
    static int[] array;
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int cnt=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        array = new int[n+1];
        //array[0] =Integer.parseInt(st.nextToken());
        // 첫번째 토큰을 아에 0처리를 해버리면.. 나중에 start -1 때 0 어떻게처리하는거지,..
        for (int i=1;i<=n;i++){
            array[i] = array[i-1]+Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<cnt;i++){
            st = new StringTokenizer(br.readLine());
            int start=Integer.parseInt(st.nextToken());
            int end=Integer.parseInt(st.nextToken());
            System.out.println(array[end] - array[start-1]);
        }
        }
   }


