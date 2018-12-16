package matExercisesWeekOne;

import java.time.LocalDateTime;

public class MatExcThree {
    public static void main(String[] args) {


//        Zadeklaruj pięć zmiennych typu int: minuta, godzina, rok, miesiac, dzien.
//        Przypisz im odpowiednie wartości odczytując z zegara systemowego (klasa LocalDateTime).
//        Wydrukuj bieżący czas zgodnie ze schematem: ”12:23 23.11.2017”
//        Zmodyfikuj zadanie, aby można było oprócz daty i godziny wyświetlić ile minut minęło od
//        północy. Dla wcześniejszego przykładu z zadania będzie to 743.
//        Zmodyfikuj program, tak aby pokazywał ile procent doby już minęło.
//                odaj wyświetlanie ile sekund zostało do końca doby.

        int minute;
        int hour;
        int year;
        int month;
        int day;


        LocalDateTime date = LocalDateTime.now();
        minute = date.getMinute();
        hour = date.getHour();
        year = date.getYear();
        month = date.getMonthValue();
        day = date.getDayOfMonth();
        String hourValue;
        String minuteValue = minute < 10 ? "0" + minute : Integer.toString(minute);    // operator warunkowy
        String dayValue;
        String monthValue;


        if (hour < 10) {
            hourValue = "0" + hour;
        } else {
//             hourValue= ""+hour;

            hourValue = Integer.toString(hour);
        }

//        if (minute < 10) {
//            minuteValue = "0" + minute;
//        } else {
//            minuteValue = "" + minute;
//        }

        if (day < 10) {
            dayValue = "0" + day;
        } else {
            dayValue = "" + day;
        }

        if (month < 10) {
            monthValue = "0" + month;
        } else {
            monthValue = "" + month;
        }


        int minutesFromMidnight = hour * 60 + minute;
        double percentOfDay = minutesFromMidnight / 14.4;
        int perOfDay = (int) percentOfDay;
        int secondsTillEndOfDay = (1440 - minutesFromMidnight) * 60;


        System.out.println(hourValue + ":" + minuteValue + " " + dayValue + "." + monthValue + "." + year);
        System.out.println("Minutes from midnight " + minutesFromMidnight);
        System.out.println("Percent of day " + perOfDay + "%");
        System.out.println("Seconds to midnight " + secondsTillEndOfDay);


    }
}
