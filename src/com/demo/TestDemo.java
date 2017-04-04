package com.demo;

import org.junit.Test;

public class TestDemo {
	public static void main(String[] args) {
		System.err.println("hello world");
		TestDemo t = new TestDemo();
		t.hello();
				
	}
	
	
	public void hello(){
		System.out.println("hello");
	}
	
	@Test
	public void test() {
		System.err.println("This is junit");
	}
	
	@Test
	public void tt() {
		System.err.println("This is junit of tt");
	}
	
	@Test
	public void test1() {
		System.err.println("This is junit");
	}
}
