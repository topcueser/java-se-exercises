package com.esertopcu.exercises;

import java.util.Stack;

public class CheckingBalancedBrackets {

    public static void main(String[] args) {

        String expression = "{[()]}";
        System.out.println(isBalanced(expression));
    }

    private static boolean isBalanced(String expression) {

        Stack<Character> stack = new Stack<>();
        for (char c: expression.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
