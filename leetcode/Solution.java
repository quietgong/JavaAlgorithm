package com.example.algorithm.leetcode;

class Solution {
    public static int solution(String t, String p) {
        int answer = 0;
        for (int begin = 0; begin <= t.length() - p.length(); begin++)
            if (Long.parseLong(t.substring(begin, begin + p.length())) <= Long.parseLong(p))
                answer++;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("solution(\"10203\", \"15\") = " + solution("00123", "1023"));
    }
}