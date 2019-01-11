package codewars;

import java.util.ArrayList;
import java.util.List;

public class WhoLikesIt {


    public static void main(String[] args) {

    }


    private static String whoLikesIt(String... names) {

        List<String> peoples = new ArrayList<>();

        for (String name : names) {
            peoples.add(name);
        }

        int howManyPeoplethanThree = peoples.size() - 2;

        if (peoples.size() == 0) {
            return "no one likes this";
        } else if (peoples.size() == 1) {
            return peoples.get(0) + " likes this";
        } else if (peoples.size() == 2) {
            return peoples.get(0) + " and " + peoples.get(1) + " like this";
        } else if (peoples.size() == 3) {
            return peoples.get(0) + ", " + peoples.get(1) + " and " + peoples.get(2) + " like this";
        }
        return peoples.get(0) + ", " + peoples.get(1) + " and " + howManyPeoplethanThree + " others like this";


    }
}
