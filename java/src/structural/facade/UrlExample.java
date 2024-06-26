package structural.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlExample {
  public static void main(String[] args) throws IOException {
    URL url = new URL("http", "www.simplifycodes.com", 80, "/");
    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
    String inputLine;
    while((inputLine = in.readLine()) != null) {
      System.out.println(inputLine);
    }
  }
}
