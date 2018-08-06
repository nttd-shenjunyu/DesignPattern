package com.dhc.common.test;

public class Test {
	public static void main(String[] args) {
		Object o = new Object();
		Object o2 = new Object();
		System.out.println(o.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o.equals(o));
		System.out.println(o.equals(o2));
	}
}
