package appliances;

public abstract class Appliance {

    private int powerConsumption;

    public Appliance () {
        powerConsumption = 1;
    }

    public Appliance (int powerConsumption) {
        setPowerConsumption(powerConsumption);
    }


    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        if (powerConsumption > 0 && powerConsumption < 10000) {
        this.powerConsumption = powerConsumption;
        }
    }
    
}
