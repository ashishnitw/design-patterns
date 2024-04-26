package structural.composite;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
  public static void main(String[] args) {
    Map<String, String> personAttr = new HashMap<>();
    personAttr.put("site_role", "person");
    personAttr.put("access_role", "limited");

    Map<String, String> groupAttr = new HashMap<>();
    groupAttr.put("group_role", "claims");

    Map<String, String> secAttr = new HashMap<>();
    secAttr.putAll(personAttr);
    secAttr.putAll(groupAttr);

    System.out.println(secAttr);
  }
}
