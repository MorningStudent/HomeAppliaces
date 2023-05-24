package appliances;

public class WashMachine extends Appliance implements CanHeatWater, CanSpin {

    private byte temperature;
    private int rpm;

    public WashMachine () {
        super();
        rpm = 0;
        temperature = 0;
    }

    public WashMachine (int powerConsumption) {
        super(powerConsumption);
    }

    public WashMachine (int powerConsumption, byte temperature) {
        super(powerConsumption);
        setTemperature(temperature);
    }

    public WashMachine (int powerConsumption, int rpm) {
        super(powerConsumption);
        setRpm(rpm);
    }

    public WashMachine (int powerConsumption, byte temperature, int rpm) {
        super(powerConsumption);
        setTemperature(temperature);
        setRpm(rpm);
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public byte getTemperature() {
        return temperature;
    }

    public void setTemperature(byte temperature) {
        this.temperature = temperature;
    }

    public void heat() {
        temperature = 40;
    }

    public void spin () {
        rpm = 1000;
    }

    


    
}
