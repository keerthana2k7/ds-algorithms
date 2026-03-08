public class Exception1{
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero");
        }
        finally {
        System.out.println("Program continues");
        }
    }
}
