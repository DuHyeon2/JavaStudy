package Programmers.Lv_0.두수의차;

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 - num2;
        return answer;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution my_ans = new Solution();
        int test = my_ans.solution(10,5);
        System.out.println(test);
    }
}