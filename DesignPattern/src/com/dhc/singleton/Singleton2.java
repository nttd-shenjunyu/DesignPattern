package com.dhc.singleton;

/**
 * 懒汉式单例单例模式
 * @author shenjy
 *
 */
public class Singleton2 {
	
	private static Singleton2 instance;
	
	private Singleton2() {}
	
	public static Singleton2 getInstance() {
		if (instance == null) {
			synchronized(Singleton2.class) {
				if (instance == null) {
					instance = new Singleton2();
				}
			}
		}
		return instance;
	}
}
