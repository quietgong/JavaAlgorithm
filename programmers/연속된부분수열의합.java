package com.example.algorithm.programmers;
/*
* 연속된 부분 수열의 합이 k인 배열 후보들 중 가장 길이가 짧은 배열의 첫번째, 두번째 인덱스 반환
* 알고리즘 : 투포인터
* 투포인터 적용은 쉬웠으나, left right 의 인덱스 컨트롤이 까다로웠음
 */
public class 연속된부분수열의합 {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[2];
        int left = 0;
        int right = 0;
        long length = 1000001;
        int sum = arr[0];
        int n = arr.length;
        while (true) {
            if (sum == k && right - left < length) {
                length = right - left;
                answer[0] = left;
                answer[1] = right;
                if (right == left)
                    return answer;
            }
            if (left == n && right == n)
                break;
            if (sum <= k && right < n) {
                right++;
                if (right < n)
                    sum += arr[right];
            } else {
                if (left < n)
                    sum -= arr[left];
                left++;
            }
        }
        return answer;
    }
}
