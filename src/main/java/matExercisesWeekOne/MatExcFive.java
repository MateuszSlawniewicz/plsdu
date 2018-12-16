package matExercisesWeekOne;

public class MatExcFive {
    public static void main(String[] args) {


//        * zamiana podanego napisu (z liczbą) na `double`
//          sprawdzanie czy podany String jest pusty albo nullowy -> `boolean`
//          zamiana `String` na `BigDecimal`                                                                  //todo
//          zamiana podanej temperatury w stopniach `Celsiusza` na `Fahrenheita`
//          zamiana podanej temperatury w stopniach `Fahrenheita` na `Celsiusza`
//          zamiana podanej prędkości `km/h` (kilometrów na godzinę) na `mph` (mil na godzinę)
//          zamiana podanej prędkości `km/h` (kilometrów na godzinę) na `m/s` (metrów na sekundę)
//          zamiana podanej ilości minut na liczbę **pełnych** kwadransów (np. `45 -> 3`, `59 -> 3`)
//          DODAJ CONAJMNIEJ TRZY **WŁASNE** METODY PRZELICZAJĄCE WARTOŚCI


        System.out.println(celToFar(10.0));
        System.out.println(farToCel(50.0));
        System.out.println(numberOfFullQuadrantsOnAHour(1));
        System.out.println(numberOfFullQuadrantsOnAHour(15));
        System.out.println(numberOfFullQuadrantsOnAHour(60));
        System.out.println(numberOfFullQuadrantsOnAHour(30));

    }

    public static double stringToDouble(String a) {
        return Double.valueOf(a);
    }

    public static boolean isStringEmptyOrNull(String a) {
        return a == "" || a == null;
    }


    public static double celToFar(double a) {

        return 32.0 + (9.0 / 5.0) * a;

    }

    public static double farToCel(double b) {
        return 5.0 / 9.0 * (b - 32);

    }

    public static double kilometersPerHourToMilesPerHour(double kilometersPerHour) {

        return 0.62137 * kilometersPerHour;

    }

    public static double kilometersPerHourToMetersPerSecond(double kilometersPerHour) {

        return 3.6 * kilometersPerHour;

    }

    public static int numberOfFullQuadrantsOnAHour(int minutes) {

        int b = (minutes - (minutes % 15)) / 15;

        return b;


    }

    public static double milesPerHourToKilometersPerHour(double milesPerHour) {
        return 1.609344 * milesPerHour;

    }

}

