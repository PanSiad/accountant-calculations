public class Calculator {

    public int add(int addendA, int addendB) {
        return addendA + addendB;
    }

    public int subtract(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }

    public int multiply(int multiplicand, int multiplier) {
        return multiplicand * multiplier;
    }

    public int divide(int dividend, int divisor) {
        return dividend / divisor;
    }

    public int exponentiate(int base, int power) {
        int result = base;
        for (int i = 1; i < power; i++) {
            result *= base;
        }
        return result;
    }

    public String fullDivision(int dividend, int divisor) {
        return dividend + " = " + dividend / divisor + " * " + divisor + " + " + dividend % divisor;

    }

    public String primeFactorization(int number) {

        String representation = null;

        if (number > 1) {

            representation = number + " = ";
            int tempNumber = number;
            int divisor = 2;

            while (tempNumber != 1) {

                if (tempNumber % divisor == 0) {
                    tempNumber /= divisor;
                    representation = representation.concat(divisor + " * ");
                } else {
                    divisor++;
                }

            }
        }

        return representation.substring(0, representation.length() - 3);

    }
}