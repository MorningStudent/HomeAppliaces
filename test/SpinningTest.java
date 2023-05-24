package test;

import appliances.WashMachine;
import appliances.Blender;
import appliances.CanSpin;

public class SpinningTest implements Test {
    public boolean test() {
        return testSpinning(new Blender()) && testSpinning(new WashMachine());
    }

    public boolean testSpinning(CanSpin testable) {
        int rpmBefore = testable.getRpm();
        testable.spin();
        int rpmAfter = testable.getRpm();

        if (rpmAfter > rpmBefore) {
            System.out.println("SPINNING TEST: Passed!");
            return true;
        } else {
            System.out.println("SPINNING TEST: Failed!\nREASON: rpm before test: " + rpmBefore + 
            "\nrpm after test: " + rpmAfter
            );
            return false;
        }

    }
}
