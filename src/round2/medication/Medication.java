package round2.medication;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

enum Period{
     WEEKS,
     MONTHS,
     YEARS,
     LIFETIME;
 }
 //enum Frequency{
 //    FOUR_HOURS,
 //    ONCE_A_DAY,
 //    PRN;
 //}

// if in case asked not to use enums. I tried this when you slept
class Frequency {
  private final String name;
  public Frequency(String name) { this.name = name; }
  public String toString() { return name; }
  public static final Frequency FOUR_HOURS = new Frequency("FOUR_HOURS");
  public static final Frequency ONCE_A_DAY = new Frequency("ONCE_A_DAY");
  public static final Frequency PRN = new Frequency("PRN");
}
public class Medication {
private String medicineName;
private Date startDate;
private Date endDate;

    public ArrayList<Date> scheduleMedication(Period p,int pValue,Frequency f){
        Calendar cal = Calendar.getInstance();
        cal.setTime(startDate);

           if(p == Period.YEARS){
             cal.add(Calendar.YEAR, pValue);
             this.endDate = cal.getTime();
           }else if(p == Period.MONTHS) {
               cal.add(Calendar.MONTH, pValue);
               this.endDate = cal.getTime();
           }else if(p == Period.WEEKS) {
               cal.add(Calendar.WEEK_OF_MONTH,pValue);
               this.endDate = cal.getTime();
               //System.out.println(this.endDate);
           }
        ArrayList<Date> medicationDetails = new ArrayList<>();
           if(f==Frequency.FOUR_HOURS) {
               Calendar cal1 = Calendar.getInstance();
               cal1.setTime(this.startDate);
               System.out.println(this.startDate);
               System.out.println(this.endDate);
              while (cal1.getTime().before(this.endDate)) {
                   cal1.add(Calendar.HOUR_OF_DAY,4);
                   medicationDetails.add(cal1.getTime());
                   //System.out.println(medicationDetails.toString());
               }
           }else if(f==Frequency.ONCE_A_DAY){
               Calendar cal1 = Calendar.getInstance();
               cal1.setTime(this.startDate);
               while (cal1.getTime().before(this.endDate)) {
                   cal1.add(Calendar.DAY_OF_MONTH,1);
                   medicationDetails.add(cal1.getTime());
                   //System.out.println(medicationDetails.toString());
               }
           }
           return medicationDetails;
    }

    public String getMedicineName() {
        return medicineName;
    }
    public void setMedicineName(String medicineName){
        this.medicineName = medicineName;
    }
    public Date getStartDate(){
        return startDate;
    }
    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }
}
