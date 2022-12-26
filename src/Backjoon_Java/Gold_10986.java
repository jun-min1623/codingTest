package Backjoon_Java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 현재 미해결
public class Gold_10986 {
    static int[] array;
    static int cnt;
    static int n,m;
    public static int ret_sum_flag_to_flag_Plus_K(int[] array, int flag, int k){
        int sum=0;
        // flag 가 3 이고,k=2 총 배열이 5이면 배열의 4번째와 5번째만을 더해야 하므로
        // i = flag, i<
        for(int i=flag;i<k+flag;i++){

            sum += array[i];
        }
        return sum;
    }
    public static void main(String[] args) throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = Integer.parseInt(st.nextToken())%m;
        }
        for(int j=1;j<=n;j++){
            for(int i=0;i<n-j+1;i++){
                int temp = ret_sum_flag_to_flag_Plus_K(array,i,j);
                if(temp%3==0) cnt++;
            }
        }


        System.out.println(cnt);


    }
}
