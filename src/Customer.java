import java.lang.reflect.InvocationTargetException;

public class Customer {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        /* Calculator class - Initial checks
        int a = 4;
        int b = 3;
        int c = 330;

        System.out.println(Calculator.add(a, b) + "");
        System.out.println(Calculator.subtract(a, b) + "");
        System.out.println(Calculator.multiply(a, b) + "");
        System.out.println(Calculator.divide(a, b) + "");
        System.out.println(Calculator.exponentiate(a, b) + "");
        System.out.println(Calculator.fullDivision(a, b) + "");
        System.out.println(Calculator.primeFactorization(c) + "");
        */

        Accountant basicAccountant = new Accountant();
        basicAccountant.calculate("add", 2, 3);
        basicAccountant.calculate("subtract", 7, 3);
        basicAccountant.calculate("multiply", 2, 3);
        basicAccountant.calculate("divide", 12, 3);
        basicAccountant.payAccountant();
        basicAccountant.calculate("exponentiate", 2, 5);
        basicAccountant.calculate("fullDivision", 8, 3);
        basicAccountant.calculate("primeFactorization", 86, 0);
        basicAccountant.payAccountant();

        Accountant debuggerAccountant = new Accountant();
        debuggerAccountant.calculate("addd", 3, 5);
        debuggerAccountant.calculate("add", 101, 5);
        debuggerAccountant.payAccountant();
        debuggerAccountant.calculate("add", 99, -4);
        debuggerAccountant.calculate("add", 3, 0);
        debuggerAccountant.calculate("add", -5, -4);
        debuggerAccountant.payAccountant();

        Accountant.showTotalCalculations();
    }


}
