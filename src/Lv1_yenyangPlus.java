public class Lv1_yenyangPlus {
    static class Solution {
        public float ret_num(int num, boolean bool){
            if(bool){
                return num;
            }else{
                return num*(-1);
            }
        }
        public int solution(int[] absolutes, boolean[] signs) {

            int answer = 0;
            for(int i=0;i<absolutes.length;i++){
                answer += ret_num(absolutes[i],signs[i]);
            }
            return answer;
        }
    }

}
