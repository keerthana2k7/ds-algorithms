class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add 2 numbers: " + calc.add(10, 20));
        System.out.println("Add 3 numbers: " + calc.add(10, 20, 30));
        Animal a = new Dog();
        a.sound();
    }
}
