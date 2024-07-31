package creational.singleton;

public class SingletonThreadSafeUsingVolatile {

  private static volatile SingletonThreadSafeUsingVolatile instance;

  private SingletonThreadSafeUsingVolatile() {}

  public static SingletonThreadSafeUsingVolatile getInstance() {
    if(instance == null) {
      synchronized (SingletonThreadSafeUsingVolatile.class) {
        if(instance == null)
          instance = new SingletonThreadSafeUsingVolatile();
      }
    }
    return instance;
  }

  public static void main(String[] args) {
    SingletonThreadSafeUsingVolatile first = SingletonThreadSafeUsingVolatile.getInstance();
    SingletonThreadSafeUsingVolatile second = SingletonThreadSafeUsingVolatile.getInstance();
    if(first == second)
      System.out.println("They are same instance");
    else
      System.out.println("They are different instance");
  }
}
