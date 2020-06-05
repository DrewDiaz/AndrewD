package com.revature.calculator;

public class CalcDiv implements CalcFunction{
	@Override
	public int equation(int num1, int num2) {
		
		int solution = 0;
		solution = num1/num2;
		System.out.println(num1 + " / "+num2+" = "+solution);
		
		return solution;
		
	}
}
