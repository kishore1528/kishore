public class LTCode003 {
    public int myAtoi(String s) {
        int index = 0;
        int n = s.length();
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }

        int sign = 1;
        if (index < n && (s.charAt(index) == '-' || s.charAt(index) == '+')) {
            if (s.charAt(index) == '-') {
                sign = -1;
            }
            index++;
        }

        int result = 0;
        while (index < n && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return result * sign;
    }

    public class Solution {
        public static void main(String[] args) {
            LTCode003 solution = new LTCode003();

            System.out.println(solution.myAtoi("42"));
            System.out.println(solution.myAtoi("   -42"));
            System.out.println(solution.myAtoi("4193 with words"));
            System.out.println(solution.myAtoi("words and 987"));
            System.out.println(solution.myAtoi("-91283472332"));
            System.out.println(solution.myAtoi("91283472332"));
        }
    }
}