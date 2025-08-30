package com.gqt.corejava.Collections;

import java.util.PriorityQueue;

public class PQCode {
    public static void main(String[] args) {
        //PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(125);
        pq.add(75);
        pq.add(175);
        System.out.println(pq);

        // Peek at the head (smallest element)
        System.out.println(pq.peek());

        // Poll (removes head)
        System.out.println("Poll (removed head): " + pq.poll());
        System.out.println("After poll: " + pq);

        // Remove specific element
        boolean removed = pq.remove(125);
        System.out.println(removed);
        System.out.println(pq);

        // Contains
        System.out.println(pq.contains(150));
        System.out.println(pq.contains(200));

        // Size
        System.out.println(pq.size());

        // Iteration (order not guaranteed)
        System.out.println("Iterating elements:");
        for (Integer i : pq) {
            System.out.println(i);
        }

        // Offer (alternative to add, returns false if fails)
        pq.offer(5);
        pq.offer(300);
        System.out.println(pq);

        // Remove head using remove() (throws exception if empty)
        System.out.println(pq.remove());
        System.out.println(pq);

        // Clear all elements
        pq.clear();
        System.out.println(pq.isEmpty());
    }
}
