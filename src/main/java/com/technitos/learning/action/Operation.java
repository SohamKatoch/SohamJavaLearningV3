package com.technitos.learning.action;

import com.technitos.learning.reuse.*;

public class Operation implements  PerformOps{


    @Override
    public Integer Addition(int a, int b) {
        return a+b;
    }

    @Override
    public Integer Subtraction(int a, int b) {
        return a-b;
    }

    @Override
    public Integer Multiplication(int a, int b) {
        return a*b;
    }

    @Override
    public Integer Division(int a, int b) {
        return a/b;
    }

    @Override
    public void sayHelllo(String message) {
        System.out.println(" I am just showing the message as received --> "+message);
    }
}
