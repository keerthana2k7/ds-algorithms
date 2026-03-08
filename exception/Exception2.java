public class Exception2 {
    public static void main(String[] args) {
        int age = -5;
        if (age < 0) {
            throw new IllegalArgumentException("Invalid input: Age cannot be negative");
        }
        System.out.println("Valid age");
    }
}
