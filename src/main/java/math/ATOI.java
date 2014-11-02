package math;

/**
 * Created by never on 2014/11/2.
 */
public class ATOI {
    public int atoi(String str) {
        if (str == null || str.length() <= 0)
            return 0;
        int length = str.length();
        int result = 0;
        boolean isPlus = true;
        int current = 0;

        while (current < length && !isDigit(str.charAt(current)))
                current++;

        if (current >= length) {
            return 0;
        }

        if (current > 0 && '-' == str.charAt(current-1)) {
            isPlus = false;
        }

        while (current < length && isDigit(str.charAt(current))) {
            result = result*10 + charToInt(str.charAt(current));
            if (result >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (result <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            } else {
                current++;
            }
        }

        if (!isPlus)
            return (0-result);
        return result;
    }

    private boolean isDigit(char ch) {
        if (ch >= '0' && ch <= '9')
            return true;
        return false;
    }

    private int charToInt(char ch) {
        return ch - '0';
    }

    public int atoi2(String s) {
        s = s.trim();
        long value = 0;
        boolean isPositive = true;

        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
                if (s.charAt(i) == '-') {
                    isPositive = false;
                }
                continue;
            }
            if (s.charAt(i) < '0' || s.charAt(i) > '9') break;
            value = 10 * value + s.charAt(i) - '0';
        }
        value = isPositive == true ? value : value * -1;
        if (value < -2147483648) {
            return -2147483648;
        } else if (value > 2147483647) {
            return 2147483647;
        } else {
            return (int) value;
        }
    }
}
