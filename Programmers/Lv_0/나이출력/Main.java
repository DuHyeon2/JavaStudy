package Programmers.Lv_0.나이출력;

class Solution {
    public int solution(int age) {
        int answer = 2022-age+1;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(40));
    }
}
