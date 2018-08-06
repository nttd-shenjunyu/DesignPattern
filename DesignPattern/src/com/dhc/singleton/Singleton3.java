package com.dhc.singleton;

/**
 * ��̬�ڲ��൥��ģʽ
 * @author shenjy
 *
 */
public class Singleton3 {
	
	private Singleton3() {}
	
	static class StaticInnerClassSingleton {
		private static Singleton3 instance = new Singleton3();
	}
	
	public static Singleton3 getInstance() {
		return StaticInnerClassSingleton.instance;
	} 
}
