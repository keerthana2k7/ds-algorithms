public class Exception5 {
    public static void main(String[] args) {
        try {
            String value = "abc";
            int num = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        }
        System.out.println("Program continues...");
    }
}
