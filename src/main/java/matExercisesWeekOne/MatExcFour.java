package matExercisesWeekOne;

public class MatExcFour {
    public static void main(String[] args) {


        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
        double x = 8.0;


        System.out.println(resultOfEquation(a, b, c, x));
    }


    public static double resultOfEquation(double a, double b, double c, double x) {


//            a^(x) + b^(x+1) + c^(x+2)
        double d = Math.pow(a, x);
        double e = Math.pow(b, (x +1) );
        double f = Math.pow(c, (x + 2));
        double result = d + e + f;


        return result;
    }


}
