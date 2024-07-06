package telran.introduction;

public class Calculations {

    public static int sum(int op1, int op2) {
        int res = op1 + op2;
        return res;
    }

    public static int multiply(int op1, int op2) {
        int result = op1 * op2;
        return result;
    }

    public static int divide(int number, int divider) {
        if (divider == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        else {
            int result = number / divider;
            return result;
        }
    }

    public static int substract(int op1, int op2) {
        int result = op1 - op2;
        return result;
    }

    public static int sumOfDigits(int number) {
        String text = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char textChar = text.charAt(i);
            int digit = Character.getNumericValue(textChar);
            sum += digit;            
        }
        return sum;
    }

    public static int maxDigit(int number) {
        String text = Integer.toString(number);
        int max = 0;
        for (int i = 0; i < text.length(); i++) {
            char textChar = text.charAt(i);
            int digit = Character.getNumericValue(textChar);
            if (digit > max) {
                max = digit;
            }
        }
        return max;
    }

    public static boolean isDividedOn(int number, int divider) {
        boolean result = true; 
        if (number % divider != 0) {
            result = false;
        }
        return result;
    }
}
