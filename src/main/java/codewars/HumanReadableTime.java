package codewars;

public class HumanReadableTime {
    public static void main(String[] args) {

    }


    public static String makeReadable(int seconds) {
        // Do something

        int hours = seconds / 3600;
        int minutes = (seconds - hours * 3600) / 60;
        int sec = seconds-hours*3600-minutes*60;
        String hoursString;
        String minutesString;
        String secondsString;
        if (hours < 10) {
            hoursString = "0" + hours;
        } else {
            hoursString = Integer.toString(hours);
        }
        if (minutes < 10) {
            minutesString = "0" + minutes;
        } else {
            minutesString = Integer.toString(minutes);
        }
        if (sec < 10) {
            secondsString = "0" + sec;
        } else {
            secondsString = Integer.toString(sec);
        }


        return hoursString + ":" + minutesString + ":" + secondsString;
    }

}
