package AT_CLASS.CW.$09_Exception;

public class Calculation {
    public int addition(int a, int b){
        System.out.println("Addition is: ");
        return (a + b);
    }

    public int subtraction(int a, int b){
        System.out.println("Subtraction is: ");
        return (a - b);
    }

    public int division(int a, int b) throws ArithmeticException {
        if (b < 1) {
            throw new ArithmeticException("Division by zero is not possible");
        }
        System.out.println("Division is: ");
        return (a / b);
    }

    public int multiply(int a, int b){
        System.out.println("Multiply is: ");
        return (a * b);
    }

    public static void main(String[] args) {
        Calculation calculate = new Calculation();

        System.out.println(calculate.addition(3, 5));
        System.out.println(calculate.subtraction(3, 5));

        try {
            System.out.println(calculate.division(3, 0));
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println(calculate.multiply(3, 5));
    }
}
