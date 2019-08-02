package com.ahmedco.interpreter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Test1();
    }

    private void Test1() {
         // https://www.programcreek.com/2013/02/java-design-pattern-interprete/
        String str = "abc";
        System.out.println("Prin_000 "+   str.substring(1));
        Context context = new Context(str);
        List<Expression> list = new ArrayList<Expression>();
        list.add((Expression) new AExpression());
        list.add((Expression) new BExpression());
        list.add((Expression) new CExpression());

        for(Expression ex:list) {

             ex.interpret(context);
        }

        System.out.println( "Prin_Result_" + context.getOutput());
    }
}
