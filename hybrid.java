interface Animal {
    void sound();
}

interface Mammal {
    void walk();
}

class Dog implements Animal, Mammal {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void walk() {
        System.out.println("Dog walks on four legs");
    }
}

public class hybrid {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.walk();
    }
}
