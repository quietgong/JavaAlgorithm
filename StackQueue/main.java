package com.example.algorithm.StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        System.out.println("==========================================================");

        Stack<Integer> st = new Stack<>();
        st.push(1); // 스택 삽입
        st.push(2); // 스택 삽입
        st.push(3); // 스택 삽입
        System.out.println("스택의 최상단 원소 : " + st.peek());
        st.pop(); // 스택 제거 (3) LIFO
        System.out.println("현재 스택 상태 : " + st);
        System.out.println("스택 사이즈 : " + st.size()); // 2
        String isStackEmpty = st.empty() ? "빈 스택입니다." : "빈 스택이 아닙니다.";
        System.out.println(isStackEmpty);
        System.out.println("원소 (1) 위치 : " + st.search(1)); // 2출력, 최상단으로부터 위치 (첫 인덱스 : 1)
        System.out.println("원소 (4) 위치 : "+ st.search(4)); // 존재하지 않으면 -1 반환

        System.out.println("==========================================================");

        Queue<Integer> q = new LinkedList<>();
        q.add(1); // 큐 삽입
        q.add(2); // 큐 삽입
        q.add(3); // 큐 삽입
        System.out.println("큐의 최상단 원소 : " + q.peek());
        q.poll(); // 큐 제거 (1) FIFO
        System.out.println("현재 큐 상태 : " + q);
        System.out.println("큐 사이즈 : " + q.size()); // 2
        String isQueueEmpty = st.empty() ? "빈 스택입니다." : "빈 스택이 아닙니다.";
        System.out.println(isQueueEmpty);
    }
}
