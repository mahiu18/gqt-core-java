package com.gqt.corejava.Collections;

import java.util.TreeSet;

public class TreesetCode {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        // Adding elements (automatically sorted)
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(125);
        ts.add(75);
        ts.add(175);

        System.out.println(ts);  // sorted order

        // Duplicate not allowed
        boolean added = ts.add(100);
        System.out.println("Adding duplicate 100? " + added);
        System.out.println("After duplicate add: " + ts);

        // Access methods
        System.out.println("First element: " + ts.first());
        System.out.println("Last element: " + ts.last());

        // HeadSet, TailSet, SubSet
        System.out.println("HeadSet (<100): " + ts.headSet(100));
        System.out.println("TailSet (>=100): " + ts.tailSet(100));
        System.out.println("SubSet (50 to 150): " + ts.subSet(50, 150));

        // Navigation methods
        System.out.println("Lower(100): " + ts.lower(100));   // <100
        System.out.println("Higher(100): " + ts.higher(100)); // >100
        System.out.println("Floor(100): " + ts.floor(100));   // <=100
        System.out.println("Ceiling(100): " + ts.ceiling(100)); // >=100

        // Polling (removes first/last)
        System.out.println("PollFirst: " + ts.pollFirst());
        System.out.println("PollLast: " + ts.pollLast());
        System.out.println("After polling: " + ts);

        // Contains
        System.out.println("Contains 75? " + ts.contains(75));

        // Size
        System.out.println("Size: " + ts.size());

        // Iteration (always sorted)
        System.out.println("Iterating TreeSet:");
        for (Integer i : ts) {
            System.out.println(i);
        }

        // Descending order iteration
        System.out.println("Descending order:");
        for (Integer i : ts.descendingSet()) {
            System.out.println(i);
        }

        // Clear
        ts.clear();
        System.out.println("Is empty? " + ts.isEmpty());
    }
}
