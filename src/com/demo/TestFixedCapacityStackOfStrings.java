package com.demo;

import java.util.Scanner;

import org.junit.Test;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class TestFixedCapacityStackOfStrings {
	public static void main(String[] args) {
		FixedCapacityStackOfStrings s;
		s = new  FixedCapacityStackOfStrings(10);
		while (!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if (!item.equals("-"))
				s.push(item);
			else if (!s.isEmpty())
				StdOut.print(s.pop() + " ");
		}
		StdOut.print("(" + s.size() + " left on stack)");
	}
	
	@Test
	public void testScanner() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			System.out.println("is has: " + sc.hasNext());
			System.err.println(sc.next());
		}
		System.out.println("over");
		sc.close();
	}
}
