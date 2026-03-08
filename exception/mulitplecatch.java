public class mulitplecatch {
     public static void main(String[] args) {

        try {
            String x = null;   
            int num = Integer.parseInt(x);  
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Input is not a valid number");
        } 
        catch (NullPointerException e) {
            System.out.println("Error: Input is null");
        }
        System.out.println("Program continues...");
    }
}
