package com.codingdojo.calculator;

import java.util.ArrayList;
import java.util.List;

/**
 * Calculator
 */
public class Calculator {

    public static enum OPERATION {
        ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION
    };

    private double operandOne;
    private double operandTwo;
    private OPERATION operation;
    private double lastResult;
    private List<Double> results;

    public Calculator() {
        results = new ArrayList<>();
    }

    public double getOperandOne() {
        return operandOne;
    }

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public double getOperandTwo() {
        return operandTwo;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public OPERATION getOperation() {
        return operation;
    }

    public void setOperation(OPERATION operation) {
        this.operation = operation;
    }

    public double getLastResult() {
        return lastResult;
    }

    public void setLastResult(double lastResult) {
        this.lastResult = lastResult;
    }

    public List<Double> getResults() {
        return results;
    }

    public void setResults(List<Double> results) {
        this.results = results;
    }

    public void addResult(double result) {
        this.results.add(result);
    }

    public void performOperation() {
        if (operation == null)
            throw new IllegalArgumentException("operation cannot be null");
        switch(operation) {
            case ADDITION:
                lastResult = operandOne + operandTwo;
                break;
            case SUBTRACTION:
                lastResult = operandOne - operandTwo;
                break;
            case MULTIPLICATION:
                lastResult = operandOne * operandTwo;
                break;
            case DIVISION:
                lastResult = operandOne / operandTwo;
                break;
        }
        addResult(lastResult);
    }

}