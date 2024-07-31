package creational.singleton;

public class SingletonThreadSafe {

    // volatile keyword ensures that changes made to the instance variable are visible to all threads.
    private static volatile SingletonThreadSafe instance;

    private SingletonThreadSafe() {}

    public static SingletonThreadSafe getInstance() {
        // Double-checked locking for thread safety
        if (instance == null) {
            synchronized (SingletonThreadSafe.class) {
                if (instance == null)
                    instance = new SingletonThreadSafe();
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonThreadSafe first = SingletonThreadSafe.getInstance();
        SingletonThreadSafe second = SingletonThreadSafe.getInstance();
        if(first == second)
            System.out.println("They are same instance");
        else
            System.out.println("They are different instance");
    }
}
