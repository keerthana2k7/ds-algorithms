class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}
public class customexception {
    public static void main(String[] args) {
        try {
            int age = 15; 
            if (age < 18) {
                throw new InvalidAgeException("Age is not valid for voting");
            }
            System.out.println("Eligible to vote");
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
