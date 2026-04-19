public class SmartThermostat {
    String location;
    double currentTemp;
    double targetTemp;
    boolean ecoMode;
    boolean isOn;

    public SmartThermostat(String Location, double CurrentTemp, double TargetTemp, boolean EcoMode, boolean IsOn) {
        this.location = Location;
        this.currentTemp = CurrentTemp;
        this.targetTemp = TargetTemp;
        this.ecoMode = EcoMode;
        this.isOn = IsOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void setTargetTemp(double t) {
        targetTemp = t;
    }

    public void toggleEcoMode() {
        ecoMode = !ecoMode;
    }

    public String status() {
        return String.format("Location: %s, Current Temp: %.1f, Target Temp: %.1f, Eco Mode: %b, Is On: %b", location,
                currentTemp, targetTemp, ecoMode, isOn);
    }

    public static void main(String[] args) {
        SmartThermostat t1 = new SmartThermostat("lab", 30.0, 23.0, false, true);
        SmartThermostat t2 = new SmartThermostat("office", 15.0, 22.0, true, false);

        t2.turnOn();
        t1.setTargetTemp(25.0);
        t1.toggleEcoMode();

        System.out.println(t1.status());
        System.out.println(t2.status());
    }
}