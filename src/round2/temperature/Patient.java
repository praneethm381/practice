package round2.temperature;

import java.util.ArrayList;

public class Patient {
    private String name;
    private int age;
    private String sex;
    private ArrayList<Temperature> tempHistory = new ArrayList<Temperature>();

    public ArrayList<Temperature> getTempHistory() {
        return tempHistory;
    }

    public void setTempHistory(ArrayList<Temperature> tempHistory) {
        this.tempHistory = tempHistory;
    }

    public String getName(){

        return this.name;
    };
    public void setName(String name)
    {
        this.name = name;
    };
    public int getAge()
    {
        return this.age;
    };
    public void setAge(int age){

        this.age = age;
    };
    public String getSex()
    {
        return this.sex;
    };
    public void setSex(String sex){

        this.sex = sex;
    };

    public boolean hasFever(){
          if(tempHistory.size()>1){
              Temperature lastTemp = tempHistory.get(tempHistory.size()-1);
              Temperature lastButOneTemp = tempHistory.get(tempHistory.size()-2);

              if(lastTemp.getLocation().equals(lastButOneTemp.getLocation()) && lastTemp.getTemp()-lastButOneTemp.getTemp()>=1){
                  return true;
              }else if(!lastTemp.getLocation().equals(lastButOneTemp.getLocation())
                      &&((lastTemp.getLocation()==Location.EAR && lastButOneTemp.getLocation()==Location.ARM) || (lastTemp.getLocation()==Location.ARM && lastButOneTemp.getLocation()==Location.EAR)
                      &&(lastTemp.getTemp()-lastButOneTemp.getTemp()>=3))){
                       System.out.println("inside 3");
                       return true;
              }else  if(!lastTemp.getLocation().equals(lastButOneTemp.getLocation()) && lastTemp.getTemp()-lastButOneTemp.getTemp()>=2){
                  System.out.println("inside 2");
                  return true;
              }
          }
          return false;
    };
}
