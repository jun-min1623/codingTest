package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv1_newIdRecommend {
    static class Solution {
       public int ret_index(char[] id, int now_index){
            if(now_index+1>=id.length){
                return now_index;
            }
            if(id[now_index]=='.'){
                return ret_index(id,now_index+1);
            }else{
                return now_index;
            }
        }
        public String solution(String new_id) {
            // 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
            new_id = new_id.toLowerCase();
            String restricts = "1234567890abcdefghijklmnopqrktuvwxyz._-";
            char[] s = new_id.toCharArray();
            char[] restrict = restricts.toCharArray();
            List<Character> listC = new ArrayList<Character>();
            for (char ca : restrict) {
                listC.add(ca);
            }
            // 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
            String temp_id ="";
            for(int i =0; i<s.length;i++){
                if(listC.contains(s[i])){
                    temp_id+=s[i];
                }
            }
            // 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
            char[] ns = temp_id.toCharArray();
            String temp ="";
            int step3;
            for(int i=0;i<ns.length;i++){
                // .일 경우 .이 마지막으로 찍힌 인덱스 반환
                step3 = ret_index(ns,i);
                // .이 아니면
                if(i==step3){
                    temp+= ns[i];
                }
                // .이 1개면
                else {
                    temp+= ".";
                    i = step3-1;
                }

            }
            // 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
            if(!temp.isEmpty()&&temp.substring(0,1).equals(".")){
                temp = temp.substring(1,temp.length());
            }if(!temp.isEmpty()&&temp.substring(temp.length()-1,temp.length()).equals(".")){
                temp = temp.substring(0,temp.length()-1);
            }
            // 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
            new_id = temp;
            if(new_id.isEmpty()){
                new_id = "a";
            }
            // 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
            if(new_id.length()>=16){
                new_id = new_id.substring(0,15);
            }if(new_id.substring(new_id.length()-1,new_id.length()).equals(".")){
                new_id = new_id.substring(0,new_id.length()-1);
            }
            //7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
            if(new_id.length()<=2){
                while (new_id.length()<3){
                    new_id+=new_id.substring(new_id.length()-1,new_id.length());
                }
            }

            String answer = new_id;
            return answer;
        }
    }
}
