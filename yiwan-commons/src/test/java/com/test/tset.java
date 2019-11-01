package com.test;

public class tset {

public static void main(String[] args) {
System.out.println(tset());
}

public static final int tset() {
	int a=2;
	try {
		return a;
	} finally {
		System.out.println(a++);
		System.out.println(a);
	}
}
public static final int tsest(int a) {
	return a;
	
}
}
