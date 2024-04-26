package creational.builder;

public class BuilderLunch {
  public static class Builder {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public Builder() { // required parameters
      // required assignments
    }

    public BuilderLunch build() {
      return new BuilderLunch(this);
    }

    public Builder bread(String bread) {
      this.bread = bread;
      return this;
    }
    public Builder condiments(String condiments) {
      this.condiments = condiments;
      return this;
    }
    public Builder dressing(String dressing) {
      this.dressing = dressing;
      return this;
    }
    public Builder meat(String meat) {
      this.meat = meat;
      return this;
    }
  }

  private final String bread;
  private final String condiments;
  private final String dressing;
  private final String meat;

  private BuilderLunch(Builder builder) { // private constructor
    this.bread = builder.bread;
    this.condiments = builder.condiments;
    this.dressing = builder.dressing;
    this.meat = builder.meat;
  }

  public String getBread() {
    return bread;
  }
  public String getCondiments() {
    return condiments;
  }
  public String getDressing() {
    return dressing;
  }
  public String getMeat() {
    return meat;
  }

  public static void main(String[] args) {
    BuilderLunch.Builder builder = new BuilderLunch.Builder();
    builder.bread("wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");

    BuilderLunch lunch = builder.build();
    System.out.println(lunch.getBread());
    System.out.println(lunch.getCondiments());
    System.out.println(lunch.getDressing());
    System.out.println(lunch.getMeat());

  }


}
