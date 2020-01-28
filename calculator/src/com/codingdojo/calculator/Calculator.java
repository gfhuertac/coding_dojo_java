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

    private List<String> operations;
    private List<Double> values;

    public Calculator() {
        results = new ArrayList<>();
        operations = new ArrayList<>();
        values = new ArrayList<>();
    }

    @Deprecated
    public double getOperandOne() {
        return operandOne;
    }

    @Deprecated
    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    @Deprecated
    public double getOperandTwo() {
        return operandTwo;
    }

    @Deprecated
    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    @Deprecated
    public OPERATION getOperation() {
        return operation;
    }

    @Deprecated
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

    @Deprecated
    public void performOperation() {
        if (operation == null)
            throw new IllegalArgumentException("operation cannot be null");
        switch (operation) {
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

    private int getHighestPriorityIndex() {
        int rv = operations.indexOf("*");
        if (rv == -1) {
            rv = operations.indexOf("/");
        }
        if (rv == -1) {
            rv = operations.indexOf("+");
        }
        if (rv == -1) {
            rv = operations.indexOf("-");
        }
        return rv;
    }

    public void performOperation(double item) {
        values.add(item);
    }

    public void performOperation(String item) {
        if ("=".equals(item)) {
            while (operations.size() != 0) {
                int idx = getHighestPriorityIndex();
                if (idx == -1)
                    throw new IllegalArgumentException("No valid operation found!");
                String operator = operations.get(idx);
                double operandOne = values.get(idx);
                double operandTwo = values.get(idx + 1);
                double result = 0.0;
                switch (operator) {
                case "*":
                    result = operandOne * operandTwo;
                    break;
                case "/":
                    result = operandOne / operandTwo;
                    break;
                case "+":
                    result = operandOne + operandTwo;
                    break;
                case "-":
                    result = operandOne - operandTwo;
                    break;
                }
                values.remove(idx+1);
                values.set(idx, result);
                operations.remove(idx);
            }
            lastResult = values.get(0);
            results.add(lastResult);
            values.clear();
            operations.clear();
        } else {
            operations.add(item);
        }
    }

}