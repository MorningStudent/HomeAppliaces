package test;

public class TestApp {
    public static void main(String[] args) {
        Test hTest = new HeatingTest();
        if ( hTest.test() ) {
            System.out.println("ALL HEATING TESTS PASSED!");
        } else {
            System.out.println("SOME TESTS FAILED!");
        }

        System.out.println();

        Test sTest = new SpinningTest();
        if ( sTest.test() ) {
            System.out.println("ALL SPINNING TESTS PASSED!");
        } else {
            System.out.println("SOME TESTS FAILED!");
        }
    }
}
