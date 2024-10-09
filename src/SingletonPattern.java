
/**
 * Singleton Pattern (Creational Patterns)
 * Ensures that a class has only one instance and provides a global point of access to it.
 */

public class SingletonPattern {

    private static SingletonPattern instance;

    private SingletonPattern() {
        // private constructor to prevent instantiation
    }

    public static SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }
    public void showMessage() {
        System.out.println("Starting SingletonPattern...");
    }

}
