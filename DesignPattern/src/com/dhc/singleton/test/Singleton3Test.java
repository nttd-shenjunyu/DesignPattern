package com.dhc.singleton.test;

import com.dhc.singleton.Singleton3;

public class Singleton3Test {
	public static void main(String[] args) {
		Singleton3 s;
		for (int i = 0; i < 20; i ++) {
			s = Singleton3.getInstance();
			System.out.println(s);
		}
		
		// 多线程方式创建
		for (int i = 0; i < 2000; i ++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					Singleton3 s = Singleton3.getInstance();
					System.out.println(s);
				}
			}).start();
		}
	}
}
