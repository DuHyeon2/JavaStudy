package Programmers.Lv_1.폰켓몬;

import java.util.Arrays;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int arr1 = (nums.length)/2;
        int [] newNums = Arrays.stream(nums).distinct().toArray();
        answer = Math.min(arr1, newNums.length);
        return answer;
    }
}

public class Main {
    static Solution sol = new Solution();

    public static void main(String[] args) {
        int[] test = {1,2,3,3};
        System.out.println(sol.solution(test));
    }
}
