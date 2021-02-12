package com.lgs.lab.interface2;

public interface Numerable extends Plus, Minus, Multiply, Devide {

default void Calkulation() {
		
		System.out.println("default Calkulation");
	}
	
}
