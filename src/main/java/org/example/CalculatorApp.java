package org.example;

public class CalculatorApp {

    //This method will add the sum of 2 numbers or more and return the output
    public int add(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    //This method will multiply the product of 2 numbers or more and return the output
    public int multiply(int... nums) {
        int prod = 1;
        for (int num : nums) {
            prod *= num;
        }
        return prod;
    }

    //This method will subtract the difference of 2 numbers or more and return the output
    public double subtract(double... nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException("At least one number must be provided.");
        }

        double diff = nums[0];

        for (int i = 1; i < nums.length; i++) {
            diff -= nums[i];
        }

        return diff;
    }

    //This method will divide the 2 numbers and also check if the denominator is not equal to zero before returning the output
    public double divide(double a, double b) {
        if(b == 0){
            throw new ArithmeticException(" Cannot divide by zero");
        }
        return a / b;
    }
}
