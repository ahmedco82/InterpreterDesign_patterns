package com.ahmedco.interpreter;

public class CExpression extends Expression{


    @Override
    public void interpret(Context context) {
        System.out.println("c expression");
        String input = context.getInput();
        context.setInput(input.substring(1));
        context.setOutput(context.getOutput()+ "3");
    }
}
