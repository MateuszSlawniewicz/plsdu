package matExercisesWeekOne;

public class MatExcTwo {
    public static void main(String[] args) {


        int x = 100;
        double pi = Math.PI;
        float n = 5.2f;

        System.out.printf(x + "\n");
        System.out.printf("%.2f", pi);
        System.out.printf("\n");

        System.out.printf("%6.4f", n);
        System.out.printf("\n");

        n = 2324435.25f;
//
//        oczekiwane napisy:
//        Printing simple integer: x = 100
//        Formatted with precison: PI = 3.14
//        Formatted to specific width: n = 5.2000
//        Formatted to right margin: n = 2324435.2500


        System.out.printf("%.4f", n);


    }

}
