package test;

import appliances.Boiler;
import appliances.CanHeatWater;
import appliances.WashMachine;

public class HeatingTest implements Test {
    public boolean test() {
        return testHeating(new Boiler()) && testHeating(new WashMachine());
    }

    public boolean testHeating(CanHeatWater testable) {
        byte tempBefore = testable.getTemperature();
        testable.heat();
        byte tempAfter = testable.getTemperature();

        if (tempAfter > tempBefore) {
            System.out.println("HEATING TEST: Passed!");
            return true;
        } else {
            System.out.println("HEATING TEST: Failed!\nREASON: temp before test: " + tempBefore + 
            "\ntemp after test: " + tempAfter
            );
            return false;
        }

    }
}
