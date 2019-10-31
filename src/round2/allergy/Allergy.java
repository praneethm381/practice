package round2.allergy;

import java.util.List;

public class Allergy {
  private String name;
  private String sex;
  private int age;

  private List<String> symptoms;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getSymptoms() {
    return symptoms;
  }

  public void setSymptoms(List<String> symptoms) {
    this.symptoms = symptoms;
  }

  @Override
  public String toString() {
    return "Allergy{" +
        "name='" + name + '\'' +
        ", symptoms=" + symptoms +
        '}';
  }
}
