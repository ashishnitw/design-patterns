package creational.prototype;

import java.util.ArrayList;
import java.util.List;

class Record {

}

public class StatementExample implements Cloneable {
  private String sql;
  private List<String> parameters;
  private Record record;

  public StatementExample(String sql, List<String> parameters, Record record) {
    this.sql = sql;
    this.parameters = parameters;
    this.record = record;
  }

  public StatementExample clone() {
    try {
      return (StatementExample) super.clone();  // Shallow copy
    } catch(CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static void main(String[] args) {
    String sql = "select * from movies where title = ?";
    List<String> parameters = new ArrayList<>();
    parameters.add("Star Wars");
    Record record = new Record();
    StatementExample first = new StatementExample(sql, parameters, record);
    StatementExample second = first.clone();
  }

}
