package round2.temperature;

import java.util.ArrayList;
import java.util.List;

public class CheckInfection {
    public static void main(String args[]){
        Temperature t1 = new Temperature(40.0,Location.ARM,Scale.FAHRENHEIT);
        Temperature t2 = new Temperature(42.0,Location.MOUTH,Scale.FAHRENHEIT);

        Patient p = new Patient();
        p.setName("Naveena");
        p.setAge(28);
        p.setSex("Female");
        ArrayList<Temperature> list = new ArrayList<>();
        list.add(t1);
        list.add(t2);
        p.setTempHistory(list);
        boolean status = p.hasFever();
        System.out.println(status);
    }
}
