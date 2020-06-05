package com.revature.calculator;

public class FunctionFactory<T extends Number> {

	public CalcFunction<T> getFunc(String funcType) {
		if(funcType == null) {
			return null;
		}
		if(funcType.equalsIgnoreCase("ADD")) {
			return new CalcAdd<T>();
		}
		/*if(funcType.equalsIgnoreCase("SUBTRACT")) {
			return new CalcSub();
		}
		if(funcType.equalsIgnoreCase("MULTIPLY")) {
			return new CalcMult();
		}
		if(funcType.equalsIgnoreCase("DIVIDE")) {
			return new CalcDiv();
		}*/
		
		return null;
	}
	
}
