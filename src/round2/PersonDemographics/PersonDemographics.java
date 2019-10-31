package round2.PersonDemographics;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.*;

public class PersonDemographics {
    private String name;
    private String sex;
    private int age;
    private Date dob;

    public Map<CONTACT, String> getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(Map<CONTACT, String> contactInfo) {
        this.contactInfo = contactInfo;
    }

    private String contactNo;
    private boolean newBorn;
    private Address address;
    Map< CONTACT,String> contactInfo = new HashMap< CONTACT,String>();

    public void formatDob(String cal,boolean newBorn) throws ParseException {
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
       this.dob = df.parse(cal);
       System.out.println(this.dob);
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
