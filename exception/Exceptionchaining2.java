public class Exceptionchaining2 {
    public static void main(String[] args) {
        try {
            calculate();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
    static void calculate() {
        try {
            int a = 10 / 0;   
        } catch (ArithmeticException e) {
            RuntimeException re = new RuntimeException("Calculation failed");
            re.initCause(e);
            throw re;
        }
    }
}
