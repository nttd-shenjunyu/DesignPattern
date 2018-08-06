package com.dhc.singleton.test;

import com.dhc.singleton.Singleton;

public class SingletonTest {
	public static void main(String[] args) {
//		Singleton s;
//		for (int i = 0; i < 20; i ++) {
//			s = Singleton.getInstance();
//			System.out.println(s);
//		}
//		
//		// ���̷߳�ʽ����
//		for (int i = 0; i < 200; i ++) {
//			new Thread(new Runnable() {
//				@Override
//				public void run() {
//					Singleton s = Singleton.getInstance();
//					System.out.println(s);
//				}
//			}).start();
//		}
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		// reflexive: �Է�
		System.out.println(s1.equals(s1));
		System.out.println("s1.hashcode:" + s1.hashCode());
		
		// symmetrics�� �Գ�
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s1));
		System.out.println("s2.hashcode:" + s2.hashCode());
		
		// transitive�� ����
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
		System.out.println("s3.hashcode:" + s3.hashCode());
	}
}
