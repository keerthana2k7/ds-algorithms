interface Animal {
    void sound();
}
class Dog implements Animal {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public void sound() {
        System.out.println(name + " barks");
    }
}
public class Demo {
    public static void main(String[] args) {
        Animal a = new Dog();
        Dog d = (Dog) a;
        d.setName("Buddy");
        a.sound();
    }
}
