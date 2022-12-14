package main;


// n명 참가자에게 커피줌
// 각자 설탕 선호 preference[i] = p
// 불만족도 coffees[i](s) - p >0
// 분만족도 합 최소

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tmax_no1 {
    public int tmax_no1(int[] preferences, int[] coffees ){
        int ans=0;
        int[] pref = {1,2,3,4};
        int[] coffee = {5,3,2,3};
        //////////////2,3,3,5
        // 1 2 3 4 5
        // 5 6 7 8 9
        Arrays.sort(pref);
        Arrays.sort(coffee);
        for(int i=0;i<pref.length;i++){
            if(pref[i]<coffee[i]){
                ans += (pref[i] - coffee[i]);
            }
        }
        System.out.println(ans);
        return  ans;

    }
}
