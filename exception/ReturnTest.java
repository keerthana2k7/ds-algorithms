public class ReturnTest {
    static int test() {
        try {
            int a = 10 / 5;    
            return 1;          
        }
        catch (ArithmeticException e) {
            return 2;   
        }
        finally {
            return 3;        
        }
    }
    public static void main(String[] args) {
        System.out.println(test());
    }
}
