public class Exception6 {
    public static void main(String[] args) {
        try {
            Object obj = "Hello";
            int  num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("Error: Invalid type casting");
        }
        System.out.println("Program continues...");
    }
}
