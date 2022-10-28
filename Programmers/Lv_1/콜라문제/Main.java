package Programmers.Lv_1.콜라문제;

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){
            answer += ((n/a)*b);
            n = (n%a) + ((n/a)*b);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.solution(3,1,20));
    }
}