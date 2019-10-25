package round2.allergy;

import java.util.ArrayList;
import java.util.List;

public class CreateAllergy {

  public static void main(String[] args){

    // Create allergy object
    Allergy a = new Allergy();
    a.setName("Fever");

    List<String> symptomsList = new ArrayList<String>();
    symptomsList.add("Temperature of 100");
    symptomsList.add("Red eyes");
    symptomsList.add("Body pains");

    a.setSymptoms(symptomsList);

    // display allergy object by adding tostring method in model class.
    System.out.println(a);

    // Another way to display allergy is to get each attribute from model and print.
    System.out.println(a.getName());
    System.out.println(a.getSymptoms());
  }
}
