package com.lgs.lab.interface1;

public class Main {

	public static void main(String[] args) {
		
		MyCalculator result = new MyCalculator(5, 5, 0);
		System.out.println(result);
		result.methodPlus();
		System.out.println(result);
		result.methodMinus();
		System.out.println(result);
		result.methodMultiply();
		System.out.println(result);
		result.methodDevide();
		System.out.println(result);

	}
	
}
