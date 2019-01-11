package codewars;

import java.util.ArrayList;
import java.util.List;

public class WriteNumberInExpandedForm {


    public static void main(String[] args) {

//        Kata.expandedForm(12); # Should return "10 + 2"
//        Kata.expandedForm(42); # Should return "40 + 2"
//        Kata.expandedForm(70304); # Should return "70000 + 300 + 4"

        System.out.println(expandedForm(12));
        System.out.println(expandedForm(42));
        System.out.println(expandedForm(70304));


    }


    private static String expandedForm(int num) {

        String[] str = Integer.toString(num).split("");
        String result;
        List<String> l = new ArrayList<String>();

        for(int i = 0; i < str.length; i++){
            if(Integer.valueOf(str[i]) > 0){
                String s = str[i];
                for(int j = i; j < str.length - 1; j++){
                    s += '0';
                }
                l.add(s);
            }
        }

        result = l.toString();
        result = result.substring(1, result.length() - 1).replace(",", " +");
        System.out.println(result);

        return result;

    }
}
