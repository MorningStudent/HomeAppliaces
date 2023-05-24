package appliances;

public class Boiler extends Appliance implements CanHeatWater {

    private byte temperature;

    public Boiler () {
        super();
        temperature = 20;
    }

    public Boiler (int powerConsumption) {
        super(powerConsumption);
    }

    public Boiler (int powerConsumption, byte temperature) {
        super(powerConsumption);
        setTemperature(temperature);
    }


    public byte getTemperature() {
        return temperature;
    }

    public void setTemperature(byte temperature) {
        this.temperature = temperature;
    }

    public void heat() {
        temperature = 60;
    }

    
}
