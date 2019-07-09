package com.example.laxexamples.prefix;

import java.io.BufferedReader;
import java.util.Stack;
import java.io.File;
import java.io.FileReader;

// Your program should accept a file as its first argument. The file contains one prefix expression per line.
// input : * + 2 3 4
// output 20
// Your program should read this file and insert it into any data structure you like.
// Traverse this data structure and evaluate the prefix expression. 
// Each token is delimited by a whitespace. You may assume that sum ‘+’, 
// multiplication ‘*’ and division ‘/’ are the only valid operators appearing in the test data.
/*  */

public class prefixExpression {
	private static String MINUS = "-";
    public static void main(String[] args) throws Throwable {
        //solveChallenge(args);
    	String line =  new String("- * / 15 - 7 + 1 1 3 + 2 + 1 1");
        prefixExpressions(line);
    }

    private static void solveChallenge(String[] args) throws Throwable {
        BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])));
        String fileLine;
        //
        while ((fileLine = reader.readLine()) != null) {
            if (!fileLine.isEmpty()) {
                prefixExpressions(fileLine);
            }
        }
    }
    

    // java implementation of http://en.wikipedia.org/wiki/Polish_notation solution
    private static void prefixExpressions(String fileLine) {
        String[] elements = fileLine.split(" ");
        Stack<Double> operands = new Stack<Double>();
        //
        for (int i = elements.length - 1; i >= 0; i--) {
        	if (i==4) { 
        		int j = 10; 
        		j=j+2;
        		}
            if (!isOperand(elements[i])) {
                operands.push(Double.valueOf(elements[i]));
            } else {
                double operand1 = operands.pop();
                double operand2 = operands.pop();
                switch (elements[i]) {
                    case "+":
                        operand1 += operand2;
                        break;
                    case "-":
                        operand1 -= operand2;
                        break;
                        
                    case "*":
                        operand1 *= operand2;
                        break;
                    default:
                        operand1 /= operand2;
                        break;
                }
                operands.push(operand1);
            }
        }
        System.out.println(operands.pop().intValue());

    }

    private static boolean isOperand(String element) {
        return MINUS.equals(element) || "+".equals(element) || "*".equals(element) || "/".equals(element);
    }

}
