package Programmers.Lv_0.몫구하기;

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 / num2;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution my_ans = new Solution();
        System.out.println(my_ans.solution(100,10));
    }
}
