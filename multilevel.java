class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}

public class multilevel {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.sound();
        puppy.bark();
        puppy.play();
    }
}
