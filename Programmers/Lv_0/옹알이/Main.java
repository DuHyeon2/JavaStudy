package Programmers.Lv_0.옹알이;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] talk = {"aya", "ye", "woo", "ma"};
        String[] talktalk = {"ayaaya", "yeye", "woowoo", "mama"};
        for(String str : babbling){
            for(String my_talktalk : talktalk){
                str = str.replace(my_talktalk, "no");
            }
            for(String my_talk : talk){
                str = str.replace(my_talk, "");
            }
            if(str == ""){
                answer++;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] test = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        Solution solution = new Solution();
        System.out.println(solution.solution(test));
    }
}
