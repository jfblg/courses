public class SpeedConverter {

    public static final double MILE = 1.6;

    public static long toMilesPerHour(double kilometersPerHour) {
        double result;

        if (kilometersPerHour < 0)
            return -1;

        result = kilometersPerHour / MILE;
        return Math.round(result);
    }

    public static void printConversion(double kilometersPerHour) {
        long result = toMilesPerHour(kilometersPerHour);
        if (result == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + result + " mi/h");
        }
    }
}
