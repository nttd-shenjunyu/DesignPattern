package com.dhc.singleton;

/**
 * ����ʽ��������ģʽ
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
