package com.pluralsight.calcengine;

/**
 * Created by kdimoiu on Aug, 2021
 */
public class PowerOf implements MathProcessing{

    @Override
    public String getKeyword() {
        return "power";
    }

    @Override
    public char getSymbol() {
        return '^';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        return Math.pow(leftVal, rightVal);
    }
}
