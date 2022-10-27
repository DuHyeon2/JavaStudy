package Programmers.Lv_0.숫자비교하기;

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if (num1 == num2){
            answer = 1;
        }
        else{
            answer = -1;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(10,5));
    }
}
