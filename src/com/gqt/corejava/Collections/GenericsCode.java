package com.gqt.corejava.Collections;

import java.util.ArrayList;

public class GenericsCode {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList al1 = new ArrayList();
		al.add(100);
		//al.add("Sachin");
		al.add(100);
		//al.add('s');
		al.add(100);
		//al.add(100.768f);
		//al.add(3456.789023456);
		//al.add(t);
		System.out.println(al);
	}
}