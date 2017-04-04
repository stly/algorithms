package com.demo;

import java.util.Stack;
//import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Evaluate {
	public static void main(String[] args) {
		System.out.println("main is running");
		Stack<String> ops = new Stack<String>();
		Stack<Double> vals = new Stack<Double>();
		while (!StdIn.isEmpty()) {
			String s = StdIn.readString();
			System.out.println("s: " + s);
			System.err.println("input : " + s);
			if 		(s.equals("("))				   ;
			else if (s.equals("+"))		ops.push(s);
			else if	(s.equals("-"))		ops.push(s);
			else if	(s.equals("*"))		ops.push(s);
			else if	(s.equals("/"))		ops.push(s);
			else if	(s.equals("sqrt"))	ops.push(s);
			else if	(s.equals(")")){
				//如果为")"，弹出运算符和操作数，计算结果并压入栈
				String op = ops.pop();
				double v = vals.pop();
				if		(op.equals("+"))	v = vals.pop() + v;
				else if	(op.equals("-"))	v = vals.pop() - v;
				else if	(op.equals("*"))	v = vals.pop() * v;
				else if	(op.equals("/"))	v = vals.pop() / v;
				else if	(op.equals("sqrt"))	v = Math.sqrt(v);
				vals.push(v);
			}	
			else if (s.equals("over")) 		break;
			//如果字符串既非运算符也不是括号，将它作为double值压入栈
			else vals.push(Double.parseDouble(s));
		}
		System.err.println(vals.pop());
//		StdOut.println(vals.pop());
	}
}