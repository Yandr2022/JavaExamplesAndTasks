package by.yandr.myLearning.javaSE.examplesAndTasks.OOP;

public class ExceptionDemo {
    private static double divide(double dividend, double divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException();
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        for (int i = 0, j = 10; i <= 10; i++, j--) {
            try {
                System.out.println(String.format("%d / %d = %.2f", j, i, divide(j, i)));
            } catch (DivisionByZeroException e) {
                System.out.println(e);
            }
        }
    }
}
class DivisionByZeroException extends Exception {
    @Override
    public String toString() {
        return "division by zero is not allowed";
    }
}