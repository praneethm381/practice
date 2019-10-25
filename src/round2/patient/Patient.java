package round2.patient;

import round2.allergy.Allergy;

public class Patient {
  private String name;
  private String sex;
  private String age;
  private Allergy allergy;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public Allergy getAllergy() {
    return allergy;
  }

  public void setAllergy(Allergy allergy) {
    this.allergy = allergy;
  }

  @Override
  public String toString() {
    return "Patient{" +
        "name='" + name + '\'' +
        ", sex='" + sex + '\'' +
        ", age='" + age + '\'' +
        ", allergy=" + allergy +
        '}';
  }
}
