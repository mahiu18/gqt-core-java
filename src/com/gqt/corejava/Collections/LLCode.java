package com.gqt.corejava.Collections;

import java.util.LinkedList;

public class LLCode {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();

        // inserting data
        ll.add(100);
        ll.add(50);
        ll.add(150);
        ll.add(25);
        ll.add(125);
        ll.add(75);
        ll.add(175);
        System.out.println(ll);

        ll.add("Sachin");
        ll.add(567.67f);
        ll.add('d');
        ll.add(true);
        System.out.println(ll);

        ll.add(2, 1111);  // insert at index
        System.out.println(ll);

        ll.set(2, 2222);  // update element
        System.out.println(ll);

        ll.addFirst(9898); // only available in LinkedList
        ll.addLast(8989);
        System.out.println(ll);

        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("Samantha");
        ll1.add("Katrina");
        ll1.add("Aishwarya");
        System.out.println(ll1);

        // add all elements from another collection
        ll.addAll(ll1);
        System.out.println(ll);

        ll.addAll(3, ll1);
        System.out.println(ll);

        // ----------------------

        // ll.clear();
        // System.out.println(ll);

        LinkedList<Object> ll_clone = (LinkedList<Object>) ll.clone();
        System.out.println(ll_clone);

        boolean res1 = ll.contains(100);
        System.out.println(res1);

        res1 = ll.contains(101);
        System.out.println(res1);

        res1 = ll.containsAll(ll1);
        System.out.println(res1);

        Object object = ll.get(5);
        System.out.println(object);

        // object = ll.get(500); // will throw IndexOutOfBoundsException
        // System.out.println(object);

        int size = ll.size();
        System.out.println(size);

        System.out.println(ll.getClass());
        System.out.println(ll.getFirst()); // LinkedList method
        System.out.println(ll.getLast());  // LinkedList method

        int hashCode = ll.hashCode();
        System.out.println(hashCode);

        int indexOf = ll.indexOf("Aishwarya");
        System.out.println(indexOf);

        int lastIndexOf = ll.lastIndexOf("Aishwarya");
        System.out.println(lastIndexOf);

        boolean empty = ll.isEmpty();
        System.out.println(empty);

        // ll1.clear();
        // empty = ll1.isEmpty();
        // System.out.println(empty);

        Object remove = ll.remove(0);  // remove by index
        System.out.println(remove);
        System.out.println(ll);

        Object rm = 2222;
        remove = ll.remove(rm);  // remove by object
        System.out.println(remove);
        System.out.println(ll);

        boolean removeAll = ll.removeAll(ll1);
        System.out.println(removeAll);
        System.out.println(ll);

        ll.removeFirst(); // LinkedList method
        ll.removeLast();  // LinkedList method

        System.out.println(ll);
    }
}
