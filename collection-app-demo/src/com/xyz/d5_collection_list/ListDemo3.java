package com.xyz.d5_collection_list;

import java.util.LinkedList;

public class ListDemo3 {
    public static void main(String[] args) {
        // LinkedList可以完成队列结构,和栈结构(双链表)

        // 栈
        LinkedList<String> stack = new LinkedList<>();
        stack.addFirst("第1颗子弹");
        stack.addFirst("第2颗子弹");
        stack.addFirst("第3颗子弹");
        stack.addFirst("第4颗子弹");
        System.out.println(stack.removeFirst()); // 取出并移除第一个
        System.out.println(stack);

        // 队列
        LinkedList<String> queue = new LinkedList<>();
        queue.addLast("1号");
        queue.addLast("2号");
        queue.addLast("3号");
        queue.addLast("4号");
        // 出队
        System.out.println(queue.removeFirst()); // 取出并移除第一个
        System.out.println(queue);

    }
}
