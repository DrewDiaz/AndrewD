package com.revature.calculator;

public interface CalcFunction<T extends Number> {
Number equation(T num1, T num2);
}
