package ru.zvezdov.ocprof.chapter_3.GenericsAndCollections.Collections.Queue.commonMethods;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author Dmitry Zvezdov
 *         12.04.17.
 */
public class Methods {
    public static void main(String[] args) {

        /**
         * LIFO - offer/peek/poll
         * FIFO - push/peek/poll
         */
        Queue<Integer> queue = new ArrayDeque<>();
        System.out.println(queue.offer(10)); // { -> 10 -> }
        System.out.println(queue.offer(4));  // { -> 4 -> 10 -> }
        System.out.println(queue.peek()); // 10 { -> 4 -> 10 -> }
        System.out.println(queue.poll()); // 10 { -> 4 -> }
        System.out.println(queue.poll()); // 4 {}
        System.out.println(queue.peek()); // null

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10); // void { <- 10 <- }
        stack.push(4); // void { <- 4 <- 10 <- }
        System.out.println(stack.peek()); // 4 { <- 4 <- 10 <- }
        System.out.println(stack.poll()); // 4 { <- 10 <- }
        System.out.println(stack.poll()); // 10 {}
        System.out.println(stack.peek()); // null
    }
}
