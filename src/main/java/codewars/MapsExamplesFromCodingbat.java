package codewars;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapsExamplesFromCodingbat {
    public static void main(String[] args) {

    }

    private Map<String, String> mapBully(Map<String, String> map) {

        if (map.containsKey("a")) {
            String fromA = map.get("a");
            if (map.containsKey("b")) {
                map.replace("a", map.get("a"), "");
                map.replace("b", map.get("b"), fromA);
            } else {
                map.put("b", map.get("a"));
                map.replace("a", map.get("a"), "");
            }
        } else return map;
        return map;
    }

    private Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey(("c"))) {
            map.remove("c");
        }

        if (map.containsKey("a")) {
            if (map.containsKey("b")) {
                map.replace("b", map.get("b"), map.get("a"));
            } else {
                map.put("b", map.get("a"));
            }


        }
        return map;

    }

    private Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        } else return map;
        return map;
    }

    private List<Integer> doubling(List<Integer> nums) {
        List<Integer> lista = nums.stream()
                .map(e -> e * 2)
                .collect(Collectors.toList());
        return lista;


    }

    private List<Integer> square(List<Integer> nums) {
        List<Integer> sq = nums.stream()
                .map(e -> e * e)
                .collect(Collectors.toList());
        return sq;

    }

    private List<String> addStar(List<String> strings) {
        List<String> star = strings.stream()
                .map(e -> e + "*")
                .collect(Collectors.toList());

        return star;
    }

    private List<String> copies3(List<String> strings) {
        List<String> copies = strings.stream()
                .map(e -> e + e + e)
                .collect(Collectors.toList());
        return copies;

    }

    private List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(e -> "y" + e + "y")
                .collect(Collectors.toList());

    }

    private List<Integer> math1(List<Integer> nums) {
        return nums.stream()
                .map(e -> (e + 1) * 10)
                .collect(Collectors.toList());

    }

    private List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream()
                .map(e -> e % 10)
                .collect(Collectors.toList());

    }

    private List<String> lower(List<String> strings) {
        return strings.stream()
                .map(e -> e.toLowerCase())
                .collect(Collectors.toList());

    }

    private List<String> noX(List<String> strings) {
        return strings.stream()
                .map(e -> e.replace("x", ""))
                .collect(Collectors.toList());
    }

    private List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(e -> e >= 0)
                .collect(Collectors.toList());
    }

    private List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(e -> e % 10 != 9)
                .collect(Collectors.toList());
    }


}