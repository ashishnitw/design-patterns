package creational.singleton;

public class SingletonLazy {

    // Private static variable to hold the single instance of the class
    private static SingletonLazy instance;

    // Private constructor to prevent instantiation from outside the class
    private SingletonLazy() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    // Public static method to get the single instance of the class
    public static SingletonLazy getInstance() {
        // If instance is not initialized, create a new instance
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonLazy first = SingletonLazy.getInstance();
        SingletonLazy second = SingletonLazy.getInstance();
        // Check if both instances are same
        if (first == second) {
            System.out.println("They are same instance");
        } else {
            System.out.println("They are different instance");
        }
    }

}
