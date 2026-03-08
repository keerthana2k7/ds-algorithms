class Parent {
int a=0;
    void calculate() {
        try {
            a = 10 / 20;  
        } catch (ArithmeticException e) {
            System.out.println("Parent class handled ArithmeticException");
        }
    }
}

class Child extends Parent {
    int a=0;
    void calculate() {
        try {
            int a = 20 / 10; 
        } catch (Exception e) {
            System.out.println("Child class handled ArithmeticException");
        }
    }
}
public class demo {
    public static void main(String[] args) {
int a=0;
        Parent obj = new Child(); 
        obj.calculate();    
        System.out.println(a);    
    }
}
