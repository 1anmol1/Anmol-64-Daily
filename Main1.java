class Animal1 {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Dog1 myDog = new Dog1();
        
        myDog.eat();  
        myDog.bark();
    }
} 
