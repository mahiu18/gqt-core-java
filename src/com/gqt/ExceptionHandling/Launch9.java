package com.gqt.ExceptionHandling;

import java.util.Scanner;

class UnderageException extends Exception {
	public String getMessage() {
		return "The age is less than minimum age .Application is cannot be processed";
	}
}

class OverageException extends Exception {
	public String getMessage() {
		return "The age is more than maximum age .Application is cannot be processed";
	}
}

class Candidate {
	int age;
	void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		age = sc.nextInt();
	}

	void validate() throws UnderageException, OverageException {
		if (age < 18) {
			UnderageException uae = new UnderageException();
			System.out.println(uae.getMessage());
			throw uae;
		} else if (age > 60) {
			OverageException oae = new OverageException();
			System.out.println(oae.getMessage());
			throw oae;
		} else {
			System.out.println("Application can be processed ");
		}
	}
}

class Matrimony {
	void process(Candidate c) {
		try {
			c.collectData();
			c.validate();
		} catch (UnderageException | OverageException e) {
			try {
				c.collectData();
				c.validate();
			} catch (UnderageException | OverageException e1) {
				try {
					c.collectData();
					c.validate();
				} catch (UnderageException | OverageException e2) {
					System.out.println("Canditure is blocked ");
					System.exit(0);
				}
			}
		}
	}
}
public class Launch9 {
	public static void main(String[] args) {
		Candidate c=new Candidate();
		Matrimony m=new Matrimony();
		m.process(c);
	}
	
}
