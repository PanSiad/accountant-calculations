public class Accountant {

    private Calculator calculator;
    private float totalCalculationsCost = 0;
    private static int totalCalculations = 0;

    public Accountant() {
        this.calculator = new Calculator();
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public void calculate(String method, int a, int b) {

        boolean firstArgumentIsValid = false;
        boolean secondArgumentIsValid = false;

        if (a >= 1 && a <= 100) {
            firstArgumentIsValid = true;
        } else {
            System.out.println("Error! First argument value " + a + " is invalid. A number between 1-100 must be given.");
        }

        if ((b >= 1 && b <= 100) || (b == 0 && method.equals("primeFactorization"))) {
            secondArgumentIsValid = true;
        } else {
            if (b == 0 && !method.equals("primeFactorization")) {
                System.out.println("Error! primeFactorization method must be used for second argument = 0");
            } else {
                System.out.println("Error! Second argument value " + b + " is invalid. A number between 1-100 must be given.");
            }
        }

        if (firstArgumentIsValid && secondArgumentIsValid) {

            String result = "";
            switch (method) {
                case "add":
                    result = String.valueOf(this.calculator.add(a, b));
                    totalCalculationsCost += 1;
                    break;
                case "subtract":
                    result = String.valueOf(this.calculator.subtract(a, b));
                    totalCalculationsCost += 1;
                    break;
                case "multiply":
                    result = String.valueOf(this.calculator.multiply(a, b));
                    totalCalculationsCost += 1;
                    break;
                case "divide":
                    result = String.valueOf(this.calculator.divide(a, b));
                    totalCalculationsCost += 1;
                    break;
                case "exponentiate":
                    result = String.valueOf(this.calculator.exponentiate(a, b));
                    totalCalculationsCost += 2;
                    break;
                case "fullDivision":
                    result = String.valueOf(this.calculator.fullDivision(a, b));
                    totalCalculationsCost += 2;
                    break;
                case "primeFactorization":
                    result = String.valueOf(this.calculator.primeFactorization(a));
                    totalCalculationsCost += 2;
                    break;
                default:
                    result = "";
            }
            if (result.equals("")) {
                totalCalculationsCost += 0.5f;
                System.out.println("Error! Please give a correct calculator method name as input instead of '" + method + "'.");
            } else {
                totalCalculations += 1;
                System.out.println("The result of method " + method + " for numbers " + a + " and " + b + " is: " + result);
            }
        } else {
            totalCalculationsCost += 0.5f;
        }
        System.out.println("-----------------------------");
    }

    public void payAccountant() {
        System.out.println("Accountant's current calculations cost is: " + totalCalculationsCost);
        totalCalculationsCost = 0;
    }

    public static void showTotalCalculations() {
        System.out.println("Total calculations made by all accountants are: " + totalCalculations);
    }
}
