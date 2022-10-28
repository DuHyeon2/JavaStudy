package Programmers.Lv_1.모의고사;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        int check_a = 0, check_b = 0, check_c = 0;

        for(int i = 0; i < answers.length; i++){
            int t1, t2, t3;
            t1 = i % 5;
            t2 = i % 8;
            t3 = i % 10;
            if(answers[i] == a[t1]){
                check_a++;
            }
            if(answers[i] == b[t2]){
                check_b++;
            }
            if(answers[i] == c[t3]){
                check_c++;
            }
        }
        int check = Math.max(Math.max(check_a,check_b),check_c);

        ArrayList<Integer> list = new ArrayList<Integer>();
        if(check == check_a){
            list.add(1);
        }
        if(check == check_b){
            list.add(2);
        }
        if(check == check_c){
            list.add(3);
        }
        answer = new int[list.size()];
        for(int k = 0; k < list.size(); k++){
            answer[k] = list.get(k);
        }
        return answer;
    }
}

public class Main {
}
