package round2.patient;

import java.util.ArrayList;
import java.util.List;
import round2.allergy.Allergy;

public class CreatePatient {

  public static void main(String[] args) {
    // Create allergy object
    Allergy a = new Allergy();
    a.setName("Fever");

    List<String> symptomsList = new ArrayList<String>();
    symptomsList.add("Temperature of 100");
    symptomsList.add("Red eyes");
    symptomsList.add("Body pains");
    a.setSymptoms(symptomsList);

    Patient p = new Patient();
    p.setName("verma");
    p.setSex("Female");
    p.setAge("18");
    p.setAllergy(a);

    System.out.println(p);
  }
}
