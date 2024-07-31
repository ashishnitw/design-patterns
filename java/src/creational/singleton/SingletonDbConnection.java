package creational.singleton;

public class SingletonDbConnection {

    private static SingletonDbConnection instance;
    private int value;  // Just to show that we can have some state in the singleton class

    private SingletonDbConnection(int value) {
        this.value = value;
    }

    private static SingletonDbConnection getInstance() {
        if (instance == null) {
            synchronized (SingletonDbConnection.class) {
                if (instance == null)
                    instance = new SingletonDbConnection(10);
            }
        }
        return instance;
    }

    public static void main(String[] args) {

    }
}
