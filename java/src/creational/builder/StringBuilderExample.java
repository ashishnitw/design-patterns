package creational.builder;

public class StringBuilderExample {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    sb.append("This is an example ");
    sb.append("of the builder pattern. ");
    sb.append("It has methods to append ");
    sb.append("almost anything we want to a string. ");
    sb.append(42);
    System.out.println(sb);
  }
}
