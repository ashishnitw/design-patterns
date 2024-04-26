package creational.singleton;

public class SingletonDbDemo {
//  private static volatile SingletonDbDemo instance = null;
//  private static volatile Connection conn = null;
//  private SingletonDbDemo() {
//    try {
//      DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
//    } catch (SQLException e) {
//      e.printStackTrace();
//    }
//    if(instance != null) {
//      throw new RuntimeException("Use getInstance() method to create");
//    }
//  }
//  public static SingletonDbDemo getInstance() {
//    if(instance == null) {
//      synchronized (SingletonDbDemo.class) {
//        if(instance == null)
//          instance = new SingletonDbDemo();
//      }
//    }
//    return instance;
//  }
//
//  public Connection getConnection() {
//    if(conn == null) {
//      synchronized (SingletonDbDemo.class) {
//        if(conn == null) {
//          try {
//            String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
//            conn = DriverManager.getConnection(dbUrl);
//          } catch(SQLException e) {
//            e.printStackTrace();
//          }
//        }
//      }
//    }
//    return conn;
//  }

  public static void main(String[] args) {
//    SingletonDbDemo first = SingletonDbDemo.getInstance();
//    SingletonDbDemo second = SingletonDbDemo.getInstance();
//    if(first == second)
//      System.out.println("They are same instance");
//    else
//      System.out.println("They are different instance");
  }
}
