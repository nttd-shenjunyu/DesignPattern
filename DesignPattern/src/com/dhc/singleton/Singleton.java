package com.dhc.singleton;

/**
 * 饿汉式单例单例模式
 * @author shenjy
 *
 */
public class Singleton {
	
	private static Singleton instance = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return instance;
	}
}
