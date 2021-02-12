
package com.lgs.lab.interface1;

import com.lgs.lab.interface2.Numerable;

public class MyCalculator implements Numerable{
	
	public int value1;
	public int value2;
	public int answer;
	public String operation = "no operation";
	
	
	

	public MyCalculator(int value1, int value2, int answer) {
		super();
		this.value1 = value1;
		this.value2 = value2;
		this.answer = answer;
	}

	@Override
	public void methodPlus() {
		String operation = "Plus";
		setOperation(operation);
		int answer = getValue1() + getValue2();
		setAnswer(answer);
	}

	@Override
	public void methodMinus() {
		String operation = "Minus";
		setOperation(operation);
		int answer = getValue1() - getValue2();
		setAnswer(answer);				
	}

	@Override
	public void methodMultiply() {
		String operation = "Multiply";
		setOperation(operation);
		int answer = getValue1() * getValue2();
		setAnswer(answer);
	}

	@Override
	public void methodDevide() {
		String operation = "Devide";
		setOperation(operation);
		int answer = getValue1() / getValue2();
		setAnswer(answer);
	}

	public int getValue1() {
		return value1;
	}

	

	public int getValue2() {
		return value2;
	}


	public void setAnswer(int answer) {
		this.answer = answer;
	}
	
	
	public void setOperation(String operation) {
		this.operation = operation;
	}

	@Override
	public String toString() {
		return "MyCalculator [value1=" + value1 + " "+operation+"  value2=" + value2 + "  answer=" + answer + "]";
	}


}
