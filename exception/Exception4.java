public class Exception4 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        try {
            System.out.println(arr[5]); 
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }
        finally {
        System.out.println("Program continues");
        }
    }
}
