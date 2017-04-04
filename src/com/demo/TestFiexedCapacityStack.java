package com.demo;

import org.junit.Test;

import edu.princeton.cs.algs4.StdOut;

public class TestFiexedCapacityStack {
	
	@Test
	public void testForEach() {
		FixedCapacityStack<String> collection = new FixedCapacityStack<String>();
		collection.push("hello");
		collection.push("world");
		for (String s : collection) {
			StdOut.println(s);
		}
	}
}