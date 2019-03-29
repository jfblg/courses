import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

/**
 * TestSpeedConverter represents unit tests for the SpeedConverter
 * Goal:
 * - use parametrized test class
 * - use Junit 4
 */

public class TestSpeedConverterSuite {

    SpeedConverter speedConverter;
    long result;

    @Before
    public void initialize() {
        speedConverter = new SpeedConverter();
    }

    @Test
    public void testToMilesPerHour() {

        result = speedConverter.toMilesPerHour(10.25);
        System.out.println(result);
//        Examples of input/output:
//                * toMilesPerHour(1.5); → should return value 1
//                * toMilesPerHour(10.25); → should return value 6
//                * toMilesPerHour(-5.6); → should return value -1
//                * toMilesPerHour(25.42); → should return value 16
//                * toMilesPerHour(75.114); → should return value 47
        assertEquals("Convertion from kmh to mph must be correct", (long)6, result);
    }

    @Test
    public void testPrintConversion() {
//        Examples of input/output:
//      * printConversion(1.5); → should print the following text (into the console - System.out): 1.5 km/h = 1 mi/h
//      * printConversion(-5.6); → should print the following text (into the console - System.out): Invalid Value
//      * printConversion(25.42); → should print the following text (into the console - System.out): 25.42 km/h = 16 mi/h
//      * printConversion(75.114); → should print the following text (into the console - System.out): 75.114 km/h = 47 mi/h
        fail();
    }
}
