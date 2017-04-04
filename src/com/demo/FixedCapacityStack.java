package com.demo;

import java.util.Iterator;

public class FixedCapacityStack<Item> implements Iterable<Item>{
	private Item[] a;	// stack entries
	private int N;		// size
	private final int DEFAULT_SIZE = 10;
	public FixedCapacityStack(){
		a = (Item[]) new Object[DEFAULT_SIZE];
	}
	public FixedCapacityStack(int cap){
		a = (Item[]) new Object[cap];
	}
	public boolean isEmpty() {		
		return N == 0;
	}
	public int size() {
		return N;
	}
	public void push(Item item){
		if (N == a.length) resize(2*a.length);
		a[N++] = item;
	}
	public Item pop() {
		Item item = a[--N];
		a[N] = null;
		if (N > 0 && N == a.length/4) resize(a.length/2);
		return item;
	}
	public void resize(int max) {
		// 将大小为N < = max 的栈移动到一个新的大小为max的数组中
		Item[] temp = (Item[]) new Object[max];
		for (int i = 0; i < N; i++) {
			temp[i] = a[i];
		}
		a = temp;
	}
	@Override
	public Iterator<Item> iterator() {
		return new ReverseArrayIterator();
	}
	private class ReverseArrayIterator implements Iterator<Item>{

		private int i = N;
		@Override
		public boolean hasNext() {
			return i > 0;
		}

		@Override
		public Item next() {
			return a[--i];
		}
		
	}
}
