package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Tmax_no2 {
    class Transactions{
        private int giver_num;
        private int giver_amout;
        public void transaction(int giver_num,int giver_amout){
            setGiver_amout(giver_amout);
            setGiver_num(giver_num);
        }

        public void setGiver_amout(int giver_amout) {
            this.giver_amout = giver_amout;
        }

        public void setGiver_num(int giver_num) {
            this.giver_num = giver_num;
        }
        public int getGiver_amout() {
            return giver_amout;
        }
        public void discount_amount(int amount){
            this.giver_amout -= amount;
        }

        public int getGiver_num() {
            return giver_num;
        }
    }
    class User{
        private int user_num;
        private int user_money;
        private Stack<Transactions> moneyStack;
        private int[] index; // [1,2,1]
        private int[] moneys; //[10,20,30]
        public User(int user_num,int user_money){
            setUser_num(user_num);
            setUser_money(user_money);
            setMoneyStack();
        }
        public void addStack(Transactions t){
            this.moneyStack.push(t);
        }
        public void setMoneyStack(){
            this.moneyStack = new Stack<>();
        }
        public void setUser_money(int user_money) {
            this.user_money = user_money;
        }

        public void dischargeUser_money(int amount) {
            this.user_money = this.user_money - amount;
        }

        public void setUser_num(int user_num) {
            this.user_num = user_num;
        }

        public boolean ifMoneyStack() {
            return moneyStack.isEmpty();
        }
        public int getFinalStackmoneys(){
            int stacksums=0;
            while (!moneyStack.isEmpty()){
                stacksums += moneyStack.peek().getGiver_amout();
                moneyStack.pop();
            }
            return stacksums;
        }
        public int getUser_money() {
            return user_money+getFinalStackmoneys();
        }

        public void stackHandler(int amount){
            int tmp = moneyStack.peek().getGiver_amout();
            // 젤 상위 stack 의 돈이 빼질 돈보다 더 많을 경우
            if(tmp>amount) {
                // stack 에서 빼줌
                moneyStack.peek().discount_amount(amount);
            }else if(tmp == amount ){
                moneyStack.pop();
            }
            // 젤 상위 stack 이 더 적을 경우 뺀다.
            else{
                // 다음 amount 총량계산
                amount = amount-tmp;
                // 만약 amount 값이 음수이면, 즉 다음스택으로 넘어감
                if(amount < 0){
                    moneyStack.pop();
                    dischargeUser_money(-amount);
                }else{
                    moneyStack.pop();
                    if(moneyStack.isEmpty()){
                        dischargeUser_money(amount);
                    }
                }
            }

        }
    }
    public int[] tmax_no2(int[] balance, int[][] transaction,int[] abnormal ){
        int[] answer = {};
        User[] users = new User[balance.length];
        for(int i=0;i<balance.length;i++){
            users[i] = new User(i,balance[i]);
        }
        for(int i =0;i<transaction.length;i++){
            int giver = transaction[i][0]-1;
            int getter = transaction[i][1]-1;
            int amount = transaction[i][2];
            // 1. 주는 사람의 money을 차감
            if(users[giver].ifMoneyStack()){
                users[giver].dischargeUser_money(amount);
            }else{
                users[giver].stackHandler(amount);
            }
            // 2. 받는 사람의 stack 에 넣기
            Transactions tmp = new Transactions();
            tmp.transaction(giver,amount);
            users[getter].addStack(tmp);

        }
        int cnt = 0;
        for (User u:users
             ) {
            answer[cnt] = u.getUser_money();
            cnt++;
        }
        return answer;
    }
}
