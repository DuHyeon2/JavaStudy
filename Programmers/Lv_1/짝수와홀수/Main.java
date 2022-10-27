package Programmers.Lv_1.짝수와홀수;

class Solution {
    public String solution(int num) {
        String answer = "Odd";
        if (num%2 == 0){
            answer = "Even";
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(10));
    }
}