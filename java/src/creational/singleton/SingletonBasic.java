package creational.singleton;

public class SingletonBasic {
    private static SingletonBasic instance = new SingletonBasic();
    private SingletonBasic() {
    }
    public static SingletonBasic getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        SingletonBasic first = SingletonBasic.getInstance();
        SingletonBasic second = SingletonBasic.getInstance();
        if(first == second)
            System.out.println("They are same instance");
        else
            System.out.println("They are different instance");
    }
}
