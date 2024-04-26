package creational.singleton;

public class SingletonLazy {
  private static SingletonLazy instance = null;
  private SingletonLazy() { }
  public static SingletonLazy getInstance() {
    if(instance == null)
      instance = new SingletonLazy();
    return instance;
  }

  public static void main(String[] args) {
    SingletonLazy first = SingletonLazy.getInstance();
    SingletonLazy second = SingletonLazy.getInstance();
    if(first == second)
      System.out.println("They are same instance");
    else
      System.out.println("They are different instance");
  }
}
