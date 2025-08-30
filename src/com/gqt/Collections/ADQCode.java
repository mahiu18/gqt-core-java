package com.gqt.Collections;

import java.util.ArrayDeque;

public class ADQCode {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        // Insertion at tail
        ad.add(10);  
        ad.add(20);
        ad.add(30);
        System.out.println(ad);

        // Add at head and tail
        ad.addFirst(5);
        ad.addLast(40);
        System.out.println(ad);

        // Offer methods Similar to add 
        ad.offer(50);
        ad.offerFirst(1);
        ad.offerLast(60);
        System.out.println(ad);

        // Peek methods (look at elements without removing)
        System.out.println(ad.peek());       // first element
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());

        // Poll methods (retrieve and remove)
        System.out.println(ad.poll());       // removes head
        System.out.println(ad.pollFirst());
        System.out.println(ad.pollLast());
        System.out.println(ad);

        // Remove methods
        ad.remove(30);   // remove specific element
        System.out.println(ad);

        ad.removeFirst();
        ad.removeLast();
        System.out.println(ad);

        // Iterating elements
        System.out.println("Iterating ArrayDeque:");
        for (Integer i : ad) {
            System.out.println(i);
        }

        // Size and clear
        System.out.println(ad.size());
        ad.clear();
        System.out.println(ad.isEmpty());
    }
}
