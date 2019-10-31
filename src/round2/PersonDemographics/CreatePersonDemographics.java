package round2.PersonDemographics;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

public class CreatePersonDemographics {
    public static void main(String args[]) throws ParseException {
        Address a = new Address("Apt 911","4744 Oak street","Kansas city","MO",64112);
        PersonDemographics pd = new PersonDemographics();
        pd.setAddress(a);
        pd.setAge(28);
        pd.setName("Naveena");
        pd.setSex("Female");
        pd.setContactNo("8162047540");
        Map< CONTACT,String> hm = new HashMap< CONTACT,String>();
        hm.put(CONTACT.WORK,"8162047540");
        hm.put(CONTACT.HOME,"8162047541");
        hm.put(CONTACT.MOBILE,"8162047542");
        pd.setContactInfo(hm);
        pd.formatDob("10-30-2019 21:18:20",false);
         Calendar cal = Calendar.getInstance();
         DateFormat df = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss z");
         cal.setTime(pd.getDob());
         df.setCalendar(cal);
         df.setTimeZone(TimeZone.getTimeZone("IST"));
         System.out.println(df.format(cal.getTime()));
    }
}
