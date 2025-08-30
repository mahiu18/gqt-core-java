package com.gqt.Collections;

import java.util.HashSet;

public class HashsetCode {
    public static void main(String[] args) {
        HashSet<Object> hs = new HashSet<>();

        // Adding elements
        hs.add(100);
        hs.add(50);
        hs.add(150);
        hs.add(25);
        hs.add(125);
        hs.add(75);
        hs.add(175);
        System.out.println("HashSet: " + hs);

        // Adding duplicates (ignored)
        boolean added = hs.add(100);
        System.out.println("Adding duplicate 100? " + added);
        System.out.println("After duplicate add: " + hs);

        // Adding different data types (possible since no generics here)
        hs.add("Sachin");
        hs.add(567.67f);
        hs.add('d');
        hs.add(true);
        hs.add(null);
        System.out.println("After mixed data: " + hs);

        // Contains
        System.out.println("Contains 75? " + hs.contains(75));
        System.out.println("Contains 500? " + hs.contains(500));

        // Remove
        boolean removed = hs.remove(125);
        System.out.println("Removed 125? " + removed);
        System.out.println("After removal: " + hs);

        // Size
        System.out.println("Size: " + hs.size());

        // Iteration (order not guaranteed)
        System.out.println("Iterating HashSet:");
        for (Object o : hs) {
            System.out.println(o);
        }

        // Clone
        HashSet<Object> hs_clone = (HashSet<Object>) hs.clone();
        System.out.println("Cloned HashSet: " + hs_clone);

        // isEmpty
        System.out.println("Is empty? " + hs.isEmpty());

        // Clear all
        hs.clear();
        System.out.println("After clear: " + hs);
        System.out.println("Is empty? " + hs.isEmpty());
    }
}
