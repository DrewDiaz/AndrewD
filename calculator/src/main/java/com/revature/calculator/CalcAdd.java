package com.revature.calculator;

public class CalcAdd<T extends Number> implements CalcFunction<T> {

	@Override
	public Number equation(T num1, T num2) {
		
		
		Number solution = num1.doubleValue() + num2.doubleValue();
		System.out.println(num1 + " + "+num2+" = "+solution);
		
		return solution;
	}

}
