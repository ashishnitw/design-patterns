package structural.adapter;

import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
  public static void main(String[] args) {
    Integer[] arrayOfInts = new Integer[] {12, 13, 14};
    List<Integer> listOfInts = Arrays.asList(arrayOfInts);

    System.out.println(arrayOfInts);
    System.out.println(listOfInts);
  }
}
