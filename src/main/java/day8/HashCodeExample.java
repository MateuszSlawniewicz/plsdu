package day8;

import java.util.HashSet;
import java.util.Set;

public class HashCodeExample {
    public static void main(String[] args) {
        ConstantHashcode const1 = new ConstantHashcode("7");
        ConstantHashcode const2 = new ConstantHashcode("7");
        ConstantHashcode const3 = new ConstantHashcode("7");
        ConstantHashcode const4 = new ConstantHashcode("7");
        ConstantHashcode const5 = new ConstantHashcode("7");
        RandomHashCode random1 = new RandomHashCode("6");
        RandomHashCode random2 = new RandomHashCode("6");
        RandomHashCode random3 = new RandomHashCode("6");
        RandomHashCode random4 = new RandomHashCode("6");
        RandomHashCode random5 = new RandomHashCode("6");


        Set<ConstantHashcode> constantHashcodeSet = new HashSet<>();
        constantHashcodeSet.add(const1);
        constantHashcodeSet.add(const2);
        constantHashcodeSet.add(const3);
        constantHashcodeSet.add(const4);
        constantHashcodeSet.add(const5);
        System.out.println(constantHashcodeSet.size());
        Set<RandomHashCode> randomHashCode = new HashSet<>();
        randomHashCode.add(random1);
        randomHashCode.add(random2);
        randomHashCode.add(random3);
        randomHashCode.add(random4);
        randomHashCode.add(random5);
        System.out.println(randomHashCode.size());

        System.out.println(randomHashCode.contains(random1));


    }


}
