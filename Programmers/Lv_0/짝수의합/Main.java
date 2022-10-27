package Programmers.Lv_0.짝수의합;

import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 0; i <= n; i++){
            if(i%2==0){
                answer += i;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(4));
    }
}
