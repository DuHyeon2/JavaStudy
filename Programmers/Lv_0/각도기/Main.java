package Programmers.Lv_0.각도기;

class Solution {
    public int solution(int angle) {
        int answer = 0;
        if (0<angle && angle<90){
            answer = 1;
        }
        else if (angle == 90) {
            answer = 2;
        }
        else if (90<angle && angle<180) {
            answer = 3;
        }
        else{
            answer = 4;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(91));
    }
}
