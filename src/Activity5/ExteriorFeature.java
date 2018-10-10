package Activity5;

public class ExteriorFeature implements Feature {

  public String exteriorFeature;

  public ExteriorFeature() {
    exteriorFeature = "Generic";
  }

  public ExteriorFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }

  public String getFeature() {
    return exteriorFeature;
  }

  public void setFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }

  public String toString() {
    return "Exterior " + "[" + exteriorFeature + "]" + "\n";
  }
}
