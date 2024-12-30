package com.technitos.learning.main;

import com.technitos.learning.action.Operation;

public class TakeAction {

    public static void main(String[] args) {

        System.out.println("  Hello from Take Action " );

        Operation operation = new Operation();

        System.out.println("Add two numbers " + operation.Addition(6,2));
        System.out.println("Subtract two numbers " + operation.Subtraction(4,1));
        System.out.println("Multiply two numbers " + operation.Multiplication(6,5));
        System.out.println("divide two numbers " +  operation.Division(8,4));

    }
}
