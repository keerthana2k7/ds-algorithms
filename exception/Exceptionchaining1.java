public class Exceptionchaining1 {
    public static void main(String[] args) {

        try {
            calculate();
        } catch (RuntimeException e) {
            System.out.println("check the value , "+ e.getMessage());
            System.out.println("check the value , "+ e.getMessage());
        }
    }
    static void calculate() {
        try {
            int result = 10 / 0;  
        } catch (ArithmeticException e) {
            throw new RuntimeException("Calculation failed", e);
        }
    }
}
