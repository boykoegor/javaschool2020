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
            else if (isOperator(ch)){
                if (sb.toString().length() > 0){
                    expression.add(Double.parseDouble(sb.toString()));
                    sb = new StringBuilder();
                }
                expression.add((char) ch);
            }
            else {
                sb.append(Character.toChars(ch));
            }
        }
    }

    private static boolean isNumber(int ch) {
        return ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' ||
                ch == '8' || ch == '9' || ch == '.';
    }

    private static boolean isOperator(int ch){
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static boolean isValid(int ch) {
        return isNumber(ch) || isOperator(ch) || ch == '(';
    }

}
