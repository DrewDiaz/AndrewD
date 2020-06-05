package com.revature.calculator;

public class CalcSub implements CalcFunction{
	@Override
	public int equation(int num1, int num2) {
		int solution = num1-num2;
		System.out.println(num1 + " - "+num2+" = "+solution);
		return solution;
	}
}
