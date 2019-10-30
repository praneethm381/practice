package round2.medication;
import java.util.ArrayList;
import java.util.Date;
public class CreateMedication {
    public static void main(String args[]){
        Medication m = new Medication();
        //Calendar c = Calendar.getInstance();
        Date d = new Date();
        Period period = Period.MONTHS;
        Frequency frequency = Frequency.ONCE_A_DAY;
        //System.out.println(d);
        m.setMedicineName("CROCIN");
        m.setStartDate(d);
        ArrayList<Date> result = m.scheduleMedication(period,1,frequency);
        System.out.println(result.toString());

    }
}
