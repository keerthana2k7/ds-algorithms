public class Exception7 {
    public static void main(String[] args) {
        try {
            Thread t = new Thread();
            t.setPriority(15); 
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Illegal argument passed");
        }
        System.out.println("Program continues...");
    }
}
