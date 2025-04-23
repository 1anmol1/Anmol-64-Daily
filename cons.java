class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Animal: " + name);
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    void display() {
        super.display();
        System.out.println("Breed: " + breed);
    }
}

public class cons {
    public static void main(String[] args) {
        Dog dog = new Dog("Doggy", "Labrador");
        dog.display();
    }
}
