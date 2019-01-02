package ZadaniaSwiateczne;

public class CaughtSpeedingClass {
    public static void main(String[] args) {


// CaughtSpeedingClass - jechaliśmy samochodem trochę za szybko i załapała nas policja przy ograniczeniu do 50km/h,
//    należy napisać programm który zwróci wartość mandatu: 100zł, 200zł lub 300zł - w zależności od tego jak zareaguje policjant.
//    W przypadku przekroczenia prędkości w zakresie do 10km/h będzie to 100zł (51-60), w przypadku przekroczenia
//    prędkości o 10-20km/h będzie to 200zł (60-69) i analogicznie o 20 w górę to będzie 300zł. Jedynym wyjątkiem jest kiedy
//    akurat policjant ma dobry humor, wtedy jest łagodniejszy i reaguje tak jakbyśmy jechali 5km/h mniej.
//        (należy użyć zagnieżdżonych if else; humor policjanta i prędkość należy przekazać w argumentach) (edited)

        System.out.println(caughtSpeeding(63, true));
    }

    private static String caughtSpeeding(int speed, boolean policemanHaveGoodHumor) {

        if (policemanHaveGoodHumor == true) {
            speed = speed - 5;
        } else {
            speed = speed;
        }
        String penalty = "";

        if (speed < 50) {
            penalty = "brak mandatu";
        } else {
            if (speed < 60) {
                penalty = "100 zl";
            } else if (speed < 70) {
                penalty = "200 zl";
            } else if (speed < 80) {
                penalty = "300 zl";
            }
        }

        return penalty;
    }

}