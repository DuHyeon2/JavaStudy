package Programmers.Lv_1.옹알이2;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] talk = {"aya", "ye", "woo", "ma"};
        String[] talk2 = {"ayaaya", "yeye", "woowoo", "mama"};
        for(String str : babbling){
            for(String talking2 : talk2){
                str = str.replace(talking2, "zz");
            }
            for(String talking : talk){
                str = str.replace(talking,"clear");
            }
            str = str.replace("clear", "");
            if(str == ""){
                answer++;
            }
        }
        return answer;
    }
}

public class Main {
}
