package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv1_kakaoblind_report {
    static class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            int[] answer = new int[id_list.length];
            AllMembers allMembers = new AllMembers(id_list,report,k);
            allMembers.setBanned();
            allMembers.printBanned(answer);
            return answer;
        }

    }
    static class AllMembers{
        private String[] members;
        private String[] report;
        private int k;
        private List<User> mems;
        public AllMembers(String[] members,String[] report,int k){
            setMembers(members,report,k);
            setUserIds();
            reportAlgo();
        }
        public void setMembers(String[] members,String[] report,int k) {
            this.members = members;
            this.report = report;
            this.k = k;
        }

        public void setUserIds(){
            List<User> mems = new ArrayList<>();
            for(int i=0;i<members.length;i++){
                User user = new User(members[i],i);
                mems.add(user);
            }
            setMems(mems);
        }
        public void reportAlgo(){
            for (String reporter_and_reported:report
                 ) {
                String[] str = reporter_and_reported.split(" ");
                mems.get(ret_memIndex(str[0])).addMy_report(str[1]);
                mems.get(ret_memIndex(str[1])).addReported(str[0]);
            }
        }
        public void setBanned(){
            for (User u:mems
                 ) {
                u.isBanned(this.k);
            }
        }
        public int ret_memIndex(String str){
            for (User u:this.mems
                 ) {
                if (u.getName().equals(str))
                    return u.getMyIndex();
            }
            return 0;
        }
        public void setMems(List<User> mems) {
            this.mems = mems;
        }
        public void check_final_email_cnt(User user){
            if(user.my_report.size()>0){
                // 현재 유저의 myreport 각자당 user 클래스 불러와서 banned 이면 카운트 1 추가
                for (String name:user.my_report
                     ) {
                    if(mems.get(ret_memIndex(name)).isBanned(k)){
                        user.addEmail_cnt();
                    }
                }
            }
        }
        public void printBanned(int[] ans){
            for (User u:mems
                 ) {
                check_final_email_cnt(u);
            }
            for(int i=0;i<mems.size();i++){
                ans[i] = mems.get(i).getGetEmailed_cnt();
            }
        }
    }
    static class User{
        private String name;

        private List<String> reported;
        private List<String> my_report;
        private boolean banned;
        private int reported_cnt;
        private int myIndex;
        private int getEmailed_cnt;
        public User(String name, int myIndex){
            setName(name);
            setMy_report();
            setReported();
            setGetEmailed();
            this.myIndex = myIndex;
            this.reported_cnt=0;
        }

        public List<String> getMy_report(){
            return this.my_report;
        }
        public void setGetEmailed() {
            this.getEmailed_cnt = 0;
        }
        public int getGetEmailed_cnt(){
            return this.getEmailed_cnt;
        }

        public void setMy_report() {
            this.my_report = new ArrayList<>();
        }public void setReported(){
            this.reported = new ArrayList<>();
        }

        public void setName(String name){
            this.name = name;
        }
        public String getName() {
            return this.name;
        }

        public int getMyIndex() {
            return myIndex;
        }

        public void addReported(String name){
            if(!reported.contains(name)){
                this.reported.add(name);
                this.reported_cnt++;
            }
        }
        public void addMy_report(String name){
            if(!my_report.contains(name)){
                this.my_report.add(name);
            }
        }
        public void addEmail_cnt(){
            this.getEmailed_cnt++;
        }
        public boolean isBanned(int k){
            if(k<=reported_cnt) this.banned = true;
            return this.banned;
        }
    }
}
