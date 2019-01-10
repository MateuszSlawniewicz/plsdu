package codewars;

public class HighestAndLowest {


    public static void main(String[] args) {


        String numbers = "1 2 3 4 5";
        System.out.println(highAndLow(numbers));




    }


    private static String highAndLow(String numbers) {

        String [] strs = numbers.split(" ");      // zwraca tablice stringów, jako odstępstwo spacja - " "
        Integer [] ints = new Integer[strs.length];

        for (int i = 0; i < strs.length; i++) {
            ints[i] = Integer.parseInt(strs[i]);    // pareInt zmienia string na int
        }

        Integer max = ints[0];
        Integer min = ints[0];

        for (int i = 0; i < ints.length; i++) {
            if(max < ints[i])
                max = ints[i];
            if(min > ints[i])
                min = ints[i];
        }

        return max.toString() + " " + min.toString();
    }


}
