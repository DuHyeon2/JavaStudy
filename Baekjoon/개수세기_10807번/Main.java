package Baekjoon.개수세기_10807번;

import java.util.Scanner;

public class Main {
    public static int Solution(int n, int [] a, int b){
        int answer = 0;
        for(int i : a){
            if(i==b){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Solution(sc.nextInt(), sc.));
    }
}
