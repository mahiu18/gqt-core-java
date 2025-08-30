package com.gqt.corejava.Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetCode {
    public static void main(String[] args) {
        LinkedHashSet<Object> lhs = new LinkedHashSet<>();

        // Adding elements
        lhs.add(100);
        lhs.add(50);
        lhs.add(150);
        lhs.add(25);
        lhs.add(125);
        lhs.add(75);
        lhs.add(175);
        System.out.println("LinkedHashSet: " + lhs);

        // Adding duplicate (ignored, keeps only one copy)
        boolean added = lhs.add(100);
        System.out.println("Adding duplicate 100? " + added);
        System.out.println("After duplicate add: " + lhs);

        // Adding mixed data types
        lhs.add("Sachin");
        lhs.add(567.67f);
        lhs.add('d');
        lhs.add(true);
        lhs.add(null);
        System.out.println("After adding mixed data: " + lhs);

        // Contains
        System.out.println("Contains 75? " + lhs.contains(75));
        System.out.println("Contains 500? " + lhs.contains(500));

        // Remove element
        boolean removed = lhs.remove(125);
        System.out.println("Removed 125? " + removed);
        System.out.println("After removal: " + lhs);

        // Size
        System.out.println("Size: " + lhs.size());

        // Iteration (insertion order is maintained)
        System.out.println("Iterating LinkedHashSet:");
        for (Object o : lhs) {
            System.out.println(o);
        }

        // Clone
        LinkedHashSet<Object> lhs_clone = (LinkedHashSet<Object>) lhs.clone();
        System.out.println("Cloned LinkedHashSet: " + lhs_clone);

        // isEmpty
        System.out.println("Is empty? " + lhs.isEmpty());

        // Clear all
        lhs.clear();
        System.out.println("After clear: " + lhs);
        System.out.println("Is empty? " + lhs.isEmpty());
    }
}
