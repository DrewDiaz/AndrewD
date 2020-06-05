package com.revature.calculator;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
	int zero = 0;
	double num1 = 25.2;
	double num2 = 5;
	double solution = 0;
	//CalcFunction calc1 = 
	FunctionFactory<Double> funcFac = new FunctionFactory<Double>();
	
    /**
     * Rigorous Test :-)
     */
    @Test
    public void calcAddTestReturn30()
    {
        CalcFunction<Double> calcAdd = funcFac.getFunc("ADD");
        solution = calcAdd.equation(num1, num2).doubleValue();
    	assertEquals( solution, 30.2,0 );
    }
    
    /*@Test
    public void calcSubTestReturn20()
    {
        CalcFunction calcSub = funcFac.getFunc("SUBTRACT");
        solution = calcSub.equation(num1, num2);
    	assertEquals( solution, 20 );
    }
    @Test
    public void calcMultTestReturn125()
    {
        CalcFunction calcMult = funcFac.getFunc("MULTIPLY");
        solution = calcMult.equation(num1, num2);
    	assertEquals( solution, 125 );
    }
    @Test
    public void calcDivTestReturn5()
    {
        CalcFunction calcDiv = funcFac.getFunc("DIVIDE");
        solution = calcDiv.equation(num1, num2);
    	assertEquals( solution, 5 );
    }*/
}
