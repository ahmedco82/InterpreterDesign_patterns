package com.ahmedco.interpreter;

public class AExpression extends Expression {

    public void interpret(Context context) {
        System.out.println("a expression");
        String input =  context.getInput();
        context.setInput(input.substring(1));
        context.setOutput(context.getOutput()+ "1");
    }
}