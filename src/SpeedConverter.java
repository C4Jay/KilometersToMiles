public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(95.75);




    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return (-1);
        }else{

            long Miles = Math.round (( kilometersPerHour / 1.6));
            return (Miles);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (toMilesPerHour(kilometersPerHour) != -1) {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }else{
            System.out.println("Invalid Value");
        }
    }

    }


