public class Human implements Breed {
    @Override
    public void run() {
        System.out.println("I am running");
    }

    @Override
    public void walk() {
        System.out.println("I am walking");
    }
}