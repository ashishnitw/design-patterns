package creational.singleton;

public class ExampleRuntime {
    public static void main(String[] args) {
        Runtime firstRuntime = Runtime.getRuntime();
        firstRuntime.gc();
        System.out.println(firstRuntime);

        Runtime secondRuntime = Runtime.getRuntime();
        System.out.println(secondRuntime);

        if (firstRuntime == secondRuntime)
            System.out.println("They are same instance");
        else
            System.out.println("They are different instance");
    }
}
