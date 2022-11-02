public class coke_problem {
    public static int ret_market(int coke, int divide, int ret_num,int sums,int drinked){
        // coke 를 마시는 과정
        if(coke>0){
            drinked += coke;
            sums += coke;
            coke = 0;
        }
        if(drinked<divide) {
            return sums;
        }
        else if (drinked%divide==0) {

            return ret_market((drinked/divide)*ret_num,divide,ret_num,sums,0);
        }
        else {
            // 딱 안나눠떨어질 경우 빈병의 갯수 조절
            int give_coke = (drinked/divide)*ret_num;
            return ret_market(give_coke,divide,ret_num,sums,drinked%divide);
        }

    }
    public static void main(String[] args) {
        int a = 3;
        int b=1;
        int n = 20;
        int answer = 0;
        int sum = 0;
        answer = ret_market(n,a,b,sum,0);
        System.out.println(answer-n);

    }
}
