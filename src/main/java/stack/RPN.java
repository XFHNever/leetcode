package stack;

import java.util.Stack;

/**
 * Created by never on 2014/11/2.
 */
public class RPN {
    public int evalRPN(String[] tokens) {
        if (tokens == null)
            return 0;

        int result = 0, i=0;
        int length = tokens.length;
        Stack<Integer> digits = new Stack<Integer>();

        while (i < length) {
            if (isDigit(tokens[i])) {
                digits.push(Integer.parseInt(tokens[i]));
            } else {
                int num1 = digits.pop();
                int num2 = digits.pop();

                char exp = tokens[i].charAt(0);
                if (exp == '+') {
                    digits.push(num1 + num2);
                } else if (exp == '-') {
                    digits.push(num2 - num1);
                } else if (exp == '*') {
                    digits.push(num1 * num2);
                } else if (exp == '/') {
                    digits.push(num2/num1);
                }
            }

            i++;
        }
        return digits.pop();
    }

    private boolean isDigit(String str) {
        if (str.length() > 1)
            return true;

        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            return true;
        }

        return false;
    }
}
