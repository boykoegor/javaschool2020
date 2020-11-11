package com.tsystems.javaschool.tasks.calculator;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Calculator {

    /**
     * Evaluate statement represented as string.
     *
     * @param statement mathematical statement containing digits, '.' (dot) as decimal mark,
     *                  parentheses, operations signs '+', '-', '*', '/'<br>
     *                  Example: <code>(1 + 38) * 4.5 - 1 / 2.</code>
     * @return string value containing result of evaluation or null if statement is invalid
     */
    public String evaluate(String statement) {
        // TODO: Implement the logic here

        if (statement == null || statement.isEmpty()) {
            return null;
        }
        try {
            Reader in = new StringReader(statement);
            return "";
        }
        catch (Exception e){
            return null;
        }
    }
    private static double parse(Reader in, int end) throws IOException {
        StringBuilder sb = new StringBuilder();
        List<Object> expression = new ArrayList<>();
        for (int ch = in.read(); ch != end; ch = in.read()){
            if(!isValid(ch)){
                throw new IOException();
            }
            if (ch == '('){
                expression.add(parse(in, ')'));
            }
            else if ()
        }
    }

    private static boolean isNumber(int ch) {

    }

    private static boolean isOperator(int ch){

    }

    private static boolean isValid(int ch) {

    }

}
