package com.tsystems.javaschool.tasks.calculator;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

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
        return "";
    }

}
