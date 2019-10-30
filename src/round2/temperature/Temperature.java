package round2.temperature;

enum Location{
    ARM,
    EAR,
    MOUTH;
}
enum Scale{
    FAHRENHEIT,
    CELSIUS,
    KELVIN;
}
public class Temperature {
    private double temp;
    private Location location;
    private Scale scale;
    Temperature(double t,Location l, Scale s){
        if(s == Scale.CELSIUS){
            this.temp = (t*9/5)+32;
            //System.out.println(this.temp);
        }else if(s == Scale.KELVIN){
            this.temp = (t-273.15)*9/5+32;
        }else if(s == Scale.FAHRENHEIT) {
            this.temp = t;
        }
        this.location = l;
        this.scale = s;
    }
    public Location getLocation(){
        return this.location;
    };
    public Scale getScale(){
        return this.scale;
    };
    public double getTemp(){
        return this.temp;
    };
}
