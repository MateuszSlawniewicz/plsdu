package codewars;

import java.util.ArrayList;
import java.util.List;

public class CountTheSmileyFaces {

    public static void main(String[] args) {
//        Given an array (arr) as an argument complete the function countSmileys that should return the total
//        number of smiling faces.
//                Rules for a smiling face:
//        -Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
//        -A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
//                -Every smiling face must have a smiling mouth that should be marked with either ) or D.
//        No additional characters are allowed except for those mentioned.
//        Valid smiley face examples:
//              :) :D ;-D :~)
//        Invalid smiley faces:
//        ;( :> :} :]


        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
//        assertEquals(4, SmileFaces.countSmileys(a));
        System.out.println(countSmileys(a));


}


    private static int countSmileys(List<String> arr) {
        


        return (int)arr.stream().filter( x -> x.matches("[:;][-~]?[)D]")).count();

    }


}
