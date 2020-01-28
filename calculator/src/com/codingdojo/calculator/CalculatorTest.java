package com.codingdojo.calculator;

/**
 * CalculatorTest
 */
public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setOperandOne(10.5);
        calculator.setOperation(Calculator.OPERATION.ADDITION);
        calculator.setOperandTwo(5.2);
        calculator.performOperation();

        calculator.performOperation(10.5);
        calculator.performOperation("+");
        calculator.performOperation(5.2);
        calculator.performOperation("*");
        calculator.performOperation(10);
        calculator.performOperation("=");

        calculator.performOperation(10.5);
        calculator.performOperation("*");
        calculator.performOperation(5.2);
        calculator.performOperation("/");
        calculator.performOperation(10);
        calculator.performOperation("=");
        
        System.out.println(calculator.getLastResult());
        calculator.getResults().stream().forEach((i)->System.out.println(i));
    }
}