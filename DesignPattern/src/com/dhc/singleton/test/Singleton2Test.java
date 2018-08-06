package com.dhc.singleton.test;

import com.dhc.singleton.Singleton2;

public class Singleton2Test {
	public static void main(String[] args) {
//		Singleton2 s;
//		for (int i = 0; i < 20; i ++) {
//			s = Singleton2.getInstance();
//			System.out.println(s);
//		}
		
		// 多线程方式创建
		for (int i = 0; i < 2000; i ++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					Singleton2 s = Singleton2.getInstance();
					System.out.println(s);
				}
			}).start();
		}
	}
}
